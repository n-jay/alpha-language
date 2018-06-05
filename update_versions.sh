#!/bin/bash
#
# Requires: xmlstarlet
##########################################

SCRIPTS_DIR=`dirname "$0"`

#####################
## PARAMETERS
BASE_DIR="."
NEW_VER=""
MODE="auto"
INTERACTIVE=1
SNAPSHOT=0
DEPTH=
QUIET=0
FORCE=0

CHANGELOG_FILE="generated_changelog.md"

processParams() {
	while getopts "hamiqsfv:d:" opt "$@"; do
		case "$opt" in
		h)
			showHelp
			exit 0
			;;
		v) NEW_VER="$OPTARG";;
        d) DEPTH="$OPTARG";;
		a) MODE="auto";;
		m) MODE="manual";;
		i) INTERACTIVE=1;;
		s) SNAPSHOT=1;;
		q) QUIET=1;;
		f) FORCE=1;;
		esac
	done

	shift $((OPTIND-1))
	[ "$1" = "--" ] && shift

	printParams

	if [ -z "${NEW_VER}" ]; then
		if [[ $SNAPSHOT == 0 ]]; then
			# prompt for version if not specified and check if valid
			read -p "  - Enter the new version to be used. Must match '^[0-9]+\.[0-9]+\.[0-9]+$' (e.g. 1.0.1): " NEW_VER
		else
			# set version current X.Y.Z+1
			local pomVer=$(getPomVer pom.xml)
			local X="`echo $pomVer | cut -d . -f 1`"
			local Y="`echo $pomVer | cut -d . -f 2`"
			local Z="`echo $pomVer | cut -d . -f 3`"
			NEW_VER="$X.$Y.$(($Z+1))"
		fi
	fi
    if [[ ! "$NEW_VER" =~ ^[0-9]+\.[0-9]+\.[0-9]+$ ]]; then
		error "Specified version '$NEW_VER' is not valid! Must match '^[0-9]+\.[0-9]+\.[0-9]+$' (e.g. 1.0.1)"
		exit 1
	fi
}

printParams() {
	info "PARAMETERS:"
	info "  - BASE_DIR    = '$BASE_DIR'"
	info "  - NEW_VER     = '$NEW_VER'"
	info "  - MODE        = '$MODE'"
	info "  - SNAPSHOT    = '$SNAPSHOT'"
	info "  - INTERACTIVE = '$INTERACTIVE'"
	info "  - DEPTH       = $DEPTH"
	info "  - QUIET       = '$QUIET'"
	info "  - FORCE       = '$FORCE'"
}


#####################
## Global Variables
WARN=0
ERRORS=0


#####################
# $1: message
info() {
	[ $QUIET -eq 0 ] && echo "[INFO] $1"
}
warn() {
	echo "$(tput setaf 3)[WARNING] $1$(tput sgr0)"
	((WARN++))
}
error() {
	echo "$(tput setaf 1)[ERROR] $1$(tput sgr0)"
	((ERRORS++))
}

showHelp() {
	echo "This commad can be used to assist changing the version of all"
	echo "eclipse projects and POM files in a given directory."
	echo ""
	echo "Usage: $0 [OPTION]... [DIR]"
	echo "DIR is the root directory of the git project. default is '.'"
	echo "Options:"
	echo "  -v new version  Specify the new version (e.g. -v 1.0.1)."
	echo "                  The '.qualifier' prefix is automatically added for eclipse projects."
	echo "  -l max depth    TODO: Sepecify the maximun depth to lookup for files in DIR."
	echo "                  When not specified no depth limit is used."
	echo "  -m              Manual mode: open vimdiff with current file on the left"
	echo "                  and suggested modification on the right."
	echo "                   - type ']c' or '[c' to go to next/prev difference."
	echo "                   - type 'do' to accept current suggestion (from the right)."
	echo "                   - type ':wqa' to save changes and exit."
	echo "  -a              Auto mode: apply modfifications automatically. Show diff if no -q."
	echo "  -i              Interactive mode: can be used wiht -a to prompt for confirmation."
	echo "                  DEFAULT mode is interactive auto."
	echo "  -s              SNAPSHOT mode: only change version of POM files and add '-SNAPSHOT'"
	echo "                    prefix to version. If no version is specified, it automatically"
    echo "                    set it as the current pom version + 1 (X.Y.Z+1)."
	echo "  -f              If working on 'master' branch or uncommited changes are detected"
	echo "                  the program suggests to exit. This will avoid that and Force it to execute anyway."
	echo "  -q              Quiet."
	echo "  -h              Display this help message and exit."
}

####################
# return list of files found
findManifestFiles() {
	local files=`find . -name "MANIFEST.MF"`
	echo "$files"
}
findFeatureFiles() {
	local files=`find . -name "feature.xml"`
	echo "$files"
}
findCategoryFiles() {
	local files=`find . -name "category.xml"`
	echo "$files"
}

####################
# Replaced old file with new
# $1: current file
# $2: suggested modification (tmp) file
applyModAuto() {
	info "  - Modified file diff:"
	info " ----------------------------------------"
	git diff --no-index --word-diff -U0 "$1" "$2"
	info " ----------------------------------------"

	if [ $INTERACTIVE -eq 1 ]; then
		read -p "  - Do you want to apply modfication? [Y/n]" yn
		case $yn in
		    [Nn]* ) info "  - Aborted!"; return 1;;
		esac
	fi

	cp -f $2 $1
	info "  - New Version set successfully."
}

applyModManual() {
	vim -d $1 $2
}

applyMod() {
	if [[ "$MODE" == "auto" ]]; then
		applyModAuto "$1" "$2"
	else
		applyModManual "$1" "$2"
	fi
}

####################
# $1: manifest file
# return: version
getBundleVer() {
    local ver=`grep -C 0 "Bundle-Version" "$1" | cut -d ':' -f 2 | tr -d '[:space:]'`
    echo "$ver"
}

# $1: file
# $2: old ver
# $3: new ver
# return created file path (with modification)
replaceBundleVer() {
	local tmp=`mktemp`
	sed "s/\([ \t]*Bundle-Version[ \t]*:[ \t]*\)${2}/\1$3/" $1 > "$tmp"
    echo "$tmp"
}


####################
# $1: feature file
# return: version
getFeatureVer() {
	#local ver=`xmllint --xpath '//feature/@version' "$1" | cut -d '"' -f 2 | tr -d '[:space:]'`
	local ver=`xmlstarlet sel -t -v "//feature/@version" "$1" | tr -d '[:space:]'`
    echo "$ver"
}

# $1: file
# $2: old ver
# $3: new ver
# return created file path (with modification)
replaceFeatureVer() {
	local tmp=`mktemp`
	xmlstarlet ed -S -O -u "//feature/@version" -v "$3" "$1" > "$tmp"
    echo "$tmp"
}


####################
# $1: category file
# return: version
getCategoryVer() {
	#XXX might have multiple features but we assume all must have same version !
	local ver=`xmlstarlet sel -t -v "//site/feature/@version" "$1" | head -1 | tr -d '[:space:]'`
    echo "$ver"
}

# $1: file
# $2: old ver
# $3: new ver
# return created file path (with modification)
replaceCategoryVer() {
	local tmp=`mktemp`
	xmlstarlet ed -S -O -u "//site/feature/@version" -v "$3" "$1" > "$tmp"
    echo "$tmp"
}

####################
# $1: pom file
# return: version
getPomVer() {
	local ver=`xmlstarlet sel -N pom=http://maven.apache.org/POM/4.0.0 -t \
		-m "/pom:project/pom:version" -v '.' "$1" | tr -d '[:space:]'`
    echo "$ver"
}


####################
#$1 file
getVer() {
	if [[ "`basename "$1"`" == "MANIFEST.MF" ]]; then
		getBundleVer "$1"
	elif [[ "`basename "$1"`" == "feature.xml" ]]; then
		getFeatureVer "$1"
	elif [[ "`basename "$1"`" == "category.xml" ]]; then
		getCategoryVer "$1"
	else
		error "Unsupported file type '$1'"
	fi 
}

# $1: file
# $2: old ver
# $3: new ver
replaceVer() {
	if [[ "`basename "$1"`" == "MANIFEST.MF" ]]; then
		replaceBundleVer "$1" "$2" "$3"
	elif [[ "`basename "$1"`" == "feature.xml" ]]; then
		replaceFeatureVer "$1" "$2" "$3"
	elif [[ "`basename "$1"`" == "category.xml" ]]; then
		replaceCategoryVer "$1" "$2" "$3"
	else
		error "Unsupported file type '$1'"
	fi 
}


####################
changeVerEclipseProjects() {
	local newVer="${NEW_VER}.qualifier"
	info "Start changing eclipse projects version to '$newVer'..."

	for f in $(findManifestFiles) $(findFeatureFiles) $(findCategoryFiles); do
		info "Updating Bundle manifest: $f"
	
		local cver=$(getVer $f)
		
		# check if extracted current version is valid
		if [ -z "$cver" ]; then
			 error "Current Bundle Version '$cver' is not valid. Skipping"
			continue
		fi
	
		# check if new version is different
	    if [[ "$cver" == "$newVer" ]]; then
			warn "Current version is already '$newVer' ! Skipping"
			continue
		fi

		# replace version in a tmp file	
	    info "  - Current Bundle Version '$cver' will be replaced by '$newVer'"
		local modFile=$(replaceVer $f $cver $newVer)

		applyMod $f $modFile
		rm $modFile
	done
}

changeVerPom() {
	local newVer="${NEW_VER}"
	[[ $SNAPSHOT == 1 ]] && newVer="${newVer}-SNAPSHOT" 
	
	info "Start changing Maven POM version to '$newVer'..."

	#mvn -P release release:update-versions -DdevelopmentVersion="$newVer" -DautoVersionSubmodules=true
	yes "$newVer" | mvn -P release release:update-versions -DautoVersionSubmodules=true
	if [ $? != 0 ]; then
		error "  - Failed !"
		return 1
	fi	

	# Change target definition version in root pom.xml
	local pomFile="pom.xml"

	info "Updating Maven root POM file (target definition): $pomFile"
	local tmp=`mktemp`
	xmlstarlet ed -S -O -N pom=http://maven.apache.org/POM/4.0.0 \
		-u "/pom:project/pom:properties/pom:target.version" \
		-v "$newVer" $pomFile > $tmp

	applyMod $pomFile $tmp
	rm $tmp
}

generateChangelog() {
	info "Generating changelog since last release inti file: '$CHANGELOG_FILE' ..."
	local changelog=`"$SCRIPTS_DIR/generate_changelog.sh" "$BASE_DIR" "$NEW_VER"`
	echo "$changelog" > "$CHANGELOG_FILE"
}

main() {
	processParams "$@"

	local oldWd=`pwd`
	cd $BASE_DIR
	
	if [ $FORCE == 0 ]; then
		if [ ! -z "`git ls-files -m`" ]; then
			warn "Found Uncommited changes! You should commit (or stash) changes before continuing."
			read -p "Exit to commit changes first? [Y/n]" yn
			[[ "$yn" =~ ^[n,N][o,O]?$ ]] || exit 10
		fi
		if [[ "`git rev-parse --abbrev-ref HEAD`" == "master" ]]; then
			warn "You are working on the 'master' branch! You should switch to another branch before continuing."
			read -p "Exit to switch branch first? [Y/n]" yn
			[[ "$yn" =~ ^[n,N][o,O]?$ ]] || exit 11
		fi
	fi

	[ $SNAPSHOT == 0 ] && (
		info "Cleanup maven projects ...";
		mvn clean;

		changeVerEclipseProjects;
	)

	changeVerPom

	[ $SNAPSHOT == 0 ] && generateChangelog

	cd $oldWd


	if [ $ERRORS == 0 ]; then
		info "Updating version finished successfully."
		warn "Do not forget to:"
		warn "  - Verify modifications: $ git diff"
		warn "  - Test build locally: $ mvn -P release -Dmaven.test.failure.ignore clean integration-test"
		if [ $SNAPSHOT == 0 ]; then
			warn "  - Review/prepend the generated changelog ($CHANGELOG_FILE) to 'CHANGELOG.md'."
			warn "  - Commit change: $ git commit . -m 'prepare version v${NEW_VER}'"
		else
			warn "  - Commit change to 'develop' branch:"
			warn "     $ git commit . -m 'start working on next version SNAPSHOT'"
		fi
		warn "  - Push to remote: $ git push"
		warn "You can refer to the 'How to release' wiki (https://gitlab.inria.fr/gecos/gecos-core/wikis/master-guide) for more info."
	else
		local nErr=$ERRORS
		error "Updating version failed!"
		error "$nErr error(s) were encountered."
		error "Try to reset modifications (git reset --hard) and start over using 'manual' mode (-m) and refer to the 'How to release' documentation."
		error "You can refer to the 'How to release' wiki (https://gitlab.inria.fr/gecos/gecos-core/wikis/master-guide) for more info."
		exit $nErr
	fi

	exit 0
}


main "$@"


