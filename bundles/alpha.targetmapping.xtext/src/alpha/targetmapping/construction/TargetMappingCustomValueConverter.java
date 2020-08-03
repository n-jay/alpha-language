package alpha.targetmapping.construction;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import alpha.targetmapping.ALPHA_LOOP_TYPE;
import alpha.targetmapping.TILING_TYPE;
import alpha.targetmapping.util.TargetMappingUtil;
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
				return TargetMappingUtil.toString(value);
			}
		};
	}

	@ValueConverter(rule = "AlphaLoopType")
	public IValueConverter<ALPHA_LOOP_TYPE> alphaLoopType() {

		return new IValueConverter<ALPHA_LOOP_TYPE> () {

			@Override
			public ALPHA_LOOP_TYPE toValue(String string, INode node) throws ValueConverterException {
				
				switch (string) {
					case "parallel":
						return ALPHA_LOOP_TYPE.PARALLEL;
					default:
						throw new IllegalArgumentException();
				}
			}

			@Override
			public String toString(ALPHA_LOOP_TYPE value) throws ValueConverterException {
				return value.getLiteral();
			}
		};
	}

	@ValueConverter(rule = "FixedSizeTilingType")
	public IValueConverter<TILING_TYPE> FixedSizeTilingType() {
		return tilingType();
	}
	@ValueConverter(rule = "ParametricTilingType")
	public IValueConverter<TILING_TYPE> ParametricTilingType() {
		return tilingType();
	}
	@ValueConverter(rule = "CompileTimeConstantTilingType")
	public IValueConverter<TILING_TYPE> CompileTimeConstantTilingType() {
		return tilingType();
	}
	
	public IValueConverter<TILING_TYPE> tilingType() {

		return new IValueConverter<TILING_TYPE> () {
			@Override
			public TILING_TYPE toValue(String string, INode node) throws ValueConverterException {
				
				switch (string) {
					case "fixed-size":
						return TILING_TYPE.FIXED_SIZE;
					case "parametric":
						return TILING_TYPE.PARAMETRIC;
					case "compile-time-constant":
						return TILING_TYPE.COMPILE_TIME_CONSTANT;
					default:
						throw new IllegalArgumentException();
				}
			}

			@Override
			public String toString(TILING_TYPE value) throws ValueConverterException {
				return value.getLiteral();
			}
		};
	}

	/*
	 * This is copy pasted from value converter for Alpha.
	 * 
	 * Alpha uses a special short-hand for zero-dimensional universe domain.
	 * Since the printing of polyhedral objects in TargetMapping uses the
	 * same methods for Alpha, the same notation must be supported in TargetMapping.
	 * 
	 */
	@ValueConverter(rule = "AISLSet")
	public IValueConverter<String> islSet() {
		return new IValueConverter<String> () {

			@Override
			public String toValue(String string, INode node) throws ValueConverterException {
				if (string.contentEquals("{}"))  return "{ [] : }"; 
				
				return string;
			}

			@Override
			public String toString(String value) throws ValueConverterException {
				return value;
			}
			
		};
	}
}
