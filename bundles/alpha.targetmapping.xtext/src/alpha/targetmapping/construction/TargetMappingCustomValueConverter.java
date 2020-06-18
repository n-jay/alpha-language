package alpha.targetmapping.construction;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import alpha.model.CALCULATOR_UNARY_OP;
import alpha.model.REDUCTION_OP;
import fr.irisa.cairn.jnimap.isl.ISLASTLoopType;

public class TargetMappingCustomValueConverter extends Ecore2XtextTerminalConverters {
	
	@ValueConverter(rule = "ISLASTLoopType")
	public IValueConverter<ISLASTLoopType> islASTLoopType() {
		return new IValueConverter<ISLASTLoopType> () {

			@Override
			public ISLASTLoopType toValue(String string, INode node) throws ValueConverterException {
				
				switch (string) {
					case "default":
						return ISLASTLoopType.isl_ast_loop_default;
					case "atomic":
						return ISLASTLoopType.isl_ast_loop_atomic;
					case "unroll":
						return ISLASTLoopType.isl_ast_loop_unroll;
					case "separate":
						return ISLASTLoopType.isl_ast_loop_separate;
					default:
						throw new IllegalArgumentException();
				}
				
			}

			@Override
			public String toString(ISLASTLoopType value) throws ValueConverterException {
				switch (value.getValue()) {
					case ISLASTLoopType.ISL_AST_LOOP_DEFAULT:
						return "default";
					case ISLASTLoopType.ISL_AST_LOOP_ATOMIC:
						return "atomic";
					case ISLASTLoopType.ISL_AST_LOOP_UNROLL:
						return "unroll";
					case ISLASTLoopType.ISL_AST_LOOP_SEPARATE:
						return "separate";
					default:
						throw new IllegalArgumentException();
				}
			}
		};
	}

}
