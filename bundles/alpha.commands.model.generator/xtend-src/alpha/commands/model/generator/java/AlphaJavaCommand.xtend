package alpha.commands.model.generator.java

import alpha.commands.model.AlphaCommand
import alpha.commands.model.AlphaCommandArgument
import alpha.commands.model.AlphaCommandSignature
import alpha.commands.model.AlphaCommandSpecialization
import alpha.commands.model.ArgumentBinding
import alpha.commands.model.ArgumentRenaming
import alpha.commands.model.ArgumentType
import alpha.commands.model.CommandArgumentSpecialization
import alpha.commands.model.DefaultValueArgument
import alpha.commands.model.OverrideArgument
import alpha.commands.model.SameAsParentArgument
import alpha.commands.model.generator.CommonExtensions
import com.google.common.collect.Streams
import java.util.function.BiFunction
import org.eclipse.xtext.EcoreUtil2

class AlphaJavaCommand {
	
	
	extension CommonExtensions commonEx = new CommonExtensions()
	
	/**
	 * Generates AlphaCommand where its body is defined manually in the protected region,
	 * followed by a series of specializations that eventually invoke the base method.
	 * 
	 * All the specializations are automatically generated including the necessary code to
	 * appropriately invoke the base method.
	 * 
	 */
	def generateBaseCommand(AlphaCommand command) {
		if (command.binding === null)
		'''
		public static «command.signature.returnTypeName» «command.name»(«command.signature.inputsList») {
			/*PROTECTED REGION ID(«command.protectedRegionID») ENABLED START*/
			throw new UnsupportedOperationException("Not implemented.");
			/*PROTECTED REGION END*/
		}
		'''
	}
	def generateSpecializationCommand(AlphaCommand command) {
		if (command.binding === null)
		'''
		«FOR specialization : command.specializations»
		«specialization.generate»
		«ENDFOR»
		'''
	}
	def generateCommandWithBindings(AlphaCommand command) {
		if (command.binding !== null) {
			val bindTarget = command.binding.bindTargetCommand
			'''
			public static «command.signature.returnTypeName» «command.name»(«command.signature.inputsList») {
				«FOR binding : command.binding.argumentBindings»
					«binding.bindingCallPreparation»
				«ENDFOR»
				«FOR renaming : command.binding.argumentRenamings»
					«renaming.bindingCallPreparation»
				«ENDFOR»
				«IF command.signature.returnType != ArgumentType.VOID»return «ENDIF»«bindTarget.name»(«bindTarget.signature.callArgumentsList»);
			}
			«FOR specialization : command.specializations»
			«specialization.generate»
			«ENDFOR»
			'''
		}
	}
	
	def bindingCallPreparation(ArgumentBinding binding) {
		val target = '''«binding.bindTarget.typeName» «binding.bindTarget.name»'''
		'''«target» = «binding.bindingMethodCall»;'''
	}
	
	def bindingCallPreparation(ArgumentRenaming renaming) {
		//Check would require looking at the specializations of the bind target
		// currently left unchecked FIXME
//		if (renaming.bindSource.argumentType != renaming.bindTarget.argumentType) 
//			throw new UnsupportedOperationException("Invalid argument renaming.");
			
		if (renaming.bindSource.name != renaming.bindTarget.name) {
			val target = '''«renaming.bindSource.typeName» «renaming.bindTarget.name»'''
			'''«target» = «renaming.bindSource.name»;'''
		}
	}
	
	def bindingMethodCall(ArgumentBinding binding) {
		'''ValueConverter.to«binding.bindTarget.typeName»(«binding.bindSource.join(", ", [b|b.name])»)'''
	}
	
	def generate(AlphaCommandSpecialization specialization) {
		val command = specialization.command
		
		'''
		public static «command.signature.returnTypeName» «command.name»(«specialization.inputsList») {
			«FOR scp : specialization.specializedCallPreparations»
				«scp»
			«ENDFOR»
			«IF command.signature.returnType != ArgumentType.VOID»return «ENDIF»«command.name»(«command.signature.callArgumentsList»);
		}
		'''
	}
	
	/**
	 * Generates code that are necessary to convert the specialized inputs into 
	 * appropriate input arguments for the base method.
	 * 
	 * The variables with names corresponding to the base command inputs are 
	 * assumed to have the right type after this block of code.
	 */
	def specializedCallPreparations(AlphaCommandSpecialization specialization) {
		val list = zipArgumentPairs(specialization, [orig, spec|getCallPreparation(spec, orig)])
		return list.filter([v|v!==null]).toArray
	}
	
	def dispatch getCallPreparation(OverrideArgument cas, AlphaCommandArgument orig) {
		'''«orig.argumentType.typeName» «orig.name» = «cas.valueConverterCall(orig)»;'''
	}
	
	def dispatch getCallPreparation(DefaultValueArgument cas, AlphaCommandArgument orig) {
		'''«orig.argumentType.typeName» «orig.name» = «cas.value»;'''
	}

	def dispatch getCallPreparation(SameAsParentArgument cas, AlphaCommandArgument orig) {
	}
	
	def valueConverterCall(OverrideArgument cas, AlphaCommandArgument orig) {
		if (cas.argumentType !== ArgumentType.STRING)
			throw new UnsupportedOperationException("Only conversion from String is supported.");
			
		val origArgs = EcoreUtil2.getAllContentsOfType(orig.eContainer, AlphaCommandArgument);
		
		val requiredType = switch (orig.argumentType) {
			case ALPHA_SYSTEM: {
				origArgs.filter[a|a.argumentType == ArgumentType.ALPHA_ROOT]
			}
			case SYSTEM_BODY,
			case VARIABLE: {
				origArgs.filter[a|a.argumentType == ArgumentType.ALPHA_SYSTEM]
			}
			case EQUATION,
			case STANDARD_EQUATION,
			case USE_EQUATION: {
				origArgs.filter[a|a.argumentType == ArgumentType.SYSTEM_BODY]
			}
			case ALPHA_EXPRESSION,
			case ABSTRACT_REDUCE_EXPRESSION,
			case BINARY_EXPRESSION: {
				origArgs.filter[
					a|a.argumentType == ArgumentType.EQUATION||
					a.argumentType == ArgumentType.STANDARD_EQUATION||
					a.argumentType == ArgumentType.USE_EQUATION
				]
			}
			case AFFINE_FUNCTION,
			case DOMAIN,
			case INTEGER,
			case INTEGER_LIST,
			case INTEGER_ARRAY: {
				//dose not need anything
				null
			}
			default: {
				throw new UnsupportedOperationException("Conversion not supported: " + orig.argumentType);
			}
		}
		
		if (requiredType !== null && requiredType.empty)
				throw new UnsupportedOperationException("Necessary variable for converting " + orig.argumentType + " is missing.");
				
		if (requiredType !== null && requiredType.length > 1)
				throw new UnsupportedOperationException("There are more than one variable for converting " + orig.argumentType + " and is ambiguous.");
		
		val specInputName = cas.specializationInputName(orig)
		if (requiredType === null) {
			'''«orig.valueConverterMethodName»(«specInputName»)'''
		} else {
			'''«orig.valueConverterMethodName»(«requiredType.get(0).name», «specInputName»)'''
		}
	}

	def private valueConverterMethodName(AlphaCommandArgument orig) {
		'''ValueConverter.to«orig.typeName»'''
	}
	
	
}