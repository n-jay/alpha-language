package alpha.commands.model.generator

import alpha.commands.model.AlphaCommand
import alpha.commands.model.AlphaCommandArgument
import alpha.commands.model.AlphaCommandCategory
import alpha.commands.model.AlphaCommandSignature
import alpha.commands.model.AlphaCommandSpecialization
import alpha.commands.model.AlphaCommandsRoot
import alpha.commands.model.ArgumentType
import alpha.commands.model.CommandArgumentSpecialization
import alpha.commands.model.DefaultValueArgument
import alpha.commands.model.OverrideArgument
import alpha.commands.model.SameAsParentArgument
import com.google.common.collect.Streams
import java.util.Set
import java.util.function.BiFunction
import org.eclipse.xtext.EcoreUtil2

class CommonExtensions {
	
	
	def typeName(AlphaCommandArgument arg) {
		arg.argumentType.typeName
	}
	
	def typeName(ArgumentType type) {
		switch (type) {
			case DOMAIN,
			case PARAMETER_DOMAIN: {
				'JNIISLSet'
			}
			case AFFINE_FUNCTION: {
				'JNIISLMultiAff'
			}
			default: {
				type.literal
			}
		}
	}
	
	
	def qualifiedName(AlphaCommand command) {
		'''«command.category.name.toFirstUpper».«command.name.toFirstUpper»'''
	}
	
	def protectedRegionID(AlphaCommand command) {
		val namePrefix = if (command.label !== null) command.label else {
			val index = command.category.commands.filter[c|c.name.contentEquals(command.name)].toList.indexOf(command)
			if (index == 0) ''''''
			else '''_«index»'''
		}
		'''«command.qualifiedName»_«namePrefix»'''
	}
	
	def returnTypeName(AlphaCommandSignature sig) {
		if (sig.returnType === null) return "void"
		else sig.returnType.typeName
	}
	
	def inputsList(AlphaCommandSignature sig) {
		sig.arguments.join(", ", [a|'''«a.argumentType.typeName» «a.name»'''])
	}
	
	def callArgumentsList(AlphaCommandSignature sig) {
		sig.arguments.join(", ", [a|'''«a.name»'''])
	}
	
	def callArgumentsList(AlphaCommandSpecialization specialization) {
		val list = zipArgumentPairs(specialization, [orig, spec|specializationInputName(spec, orig)])
		return list.filter([v|v!==null]).toArray.join(", ")
	}
	
	def Set<CharSequence> fullPath(ArgumentType type) {
		switch (type) {
			case VOID: {
				#{}
			}
			case ALPHA_NODE,
			case ALPHA_VISITABLE,
			case ALPHA_ROOT,
			case ALPHA_SYSTEM,
			case SYSTEM_BODY,
			case VARIABLE,
			case EQUATION,
			case STANDARD_EQUATION,
			case USE_EQUATION,
			case ALPHA_EXPRESSION,
			case ABSTRACT_REDUCE_EXPRESSION,
			case BINARY_EXPRESSION,
			case DEPENDENCE_EXPRESSION: {
				#{'''alpha.model.«type.literal»'''}
			}
			case AFFINE_FUNCTION: {
				#{'''fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff'''}
			}
			case DOMAIN,
			case PARAMETER_DOMAIN: {
				#{'''fr.irisa.cairn.jnimap.isl.jni.JNIISLSet'''}
			}
			case ALPHA_BUNDLE: {
				#{'''alpha.model.AlphaRoot''', '''java.util.List'''}
			}
			case STRING,
			case STRING_ARRAY,
			case INTEGER,
			case INTEGER_ARRAY: {
				#{}
			}
			case STRING_LIST,
			case INTEGER_LIST: {
				#{'''java.util.List'''}
			}
		}
	}
	
	def collectUsedClassesInBaseMethods(AlphaCommandCategory cat) {
		(EcoreUtil2.getAllContentsOfType(cat, AlphaCommandSignature).map[o|o.returnType] +
		EcoreUtil2.getAllContentsOfType(cat, AlphaCommandArgument).map[o|o.argumentType])
		.toSet.flatMap[t|t.fullPath]
	}
	
	def collectUsedClasses(AlphaCommandCategory cat) {
		(EcoreUtil2.getAllContentsOfType(cat, AlphaCommandSignature).map[o|o.returnType] +
		EcoreUtil2.getAllContentsOfType(cat, AlphaCommandArgument).map[o|o.argumentType] +
		EcoreUtil2.getAllContentsOfType(cat, OverrideArgument).map[o|o.argumentType])
		.toSet.flatMap[t|t.fullPath]
	}
	
	def collectUsedClasses(AlphaCommandsRoot root) {
		root.categories.flatMap[collectUsedClasses]
	}
	
	
	
	/**
	 * Helper function to manage traversal of parallel lists holding arguments of 
	 * the base and the specialized command. 
	 */
	def <R> zipArgumentPairs(AlphaCommandSpecialization specialization, BiFunction<? super AlphaCommandArgument, ? super CommandArgumentSpecialization, R> f) {
		val origInputs = specialization.command.signature.arguments
		val specInputs = specialization.arguments
		if (origInputs.length != specInputs.length) throw new RuntimeException("Specialization must have the same number of inputs as its base command.");
	
		Streams.zip(origInputs.stream, specInputs.stream, f)
	}
	
	/**
	 * Generates input arguments list to a specialized command.
	 */
	def inputsList(AlphaCommandSpecialization specialization) {
		val list = zipArgumentPairs(specialization, [orig, spec|getSpecializedArgument(spec, orig)])
		return list.filter([v|v!==null]).toArray.join(", ")
	}
	
	def dispatch specializationInputName(OverrideArgument cas, AlphaCommandArgument orig) {
		if (cas.name.contentEquals(orig.name)) {
			'''s_«cas.name»'''
		} else {
			cas.name
		}
	}
	
	def dispatch specializationInputName(DefaultValueArgument dva, AlphaCommandArgument orig) {
		null	
	}
	
	def dispatch specializationInputName(CommandArgumentSpecialization cas, AlphaCommandArgument orig) {
		orig.name
	}
	
	def dispatch getSpecializedArgument(OverrideArgument cas, AlphaCommandArgument orig) {
		val specInputName = cas.specializationInputName(orig)
		'''«cas.argumentType.typeName» «specInputName»'''
	}
	
	def dispatch getSpecializedArgument(DefaultValueArgument cas, AlphaCommandArgument orig) {
	}

	def dispatch getSpecializedArgument(SameAsParentArgument cas, AlphaCommandArgument orig) {
		val specInputName = cas.specializationInputName(orig)
		'''«orig.argumentType.typeName» «specInputName»'''
	}
	
}