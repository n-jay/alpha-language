package alpha.model.construction;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import alpha.model.REDUCTION_OP;

public class AlphaCustomValueConverter extends Ecore2XtextTerminalConverters {
	
//	@ValueConverter(rule = "AUnaryCalcOp")
//	public IValueConverter<CALCULATOR_UNARY_OP> calculatorUnaryOp() {
//		return new IValueConverter<CALCULATOR_UNARY_OP> () {
//
//			@Override
//			public CALCULATOR_UNARY_OP toValue(String string, INode node) throws ValueConverterException {
//
//				
//				
//				return null;
//			}
//
//			@Override
//			public String toString(CALCULATOR_UNARY_OP value) throws ValueConverterException {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
//	}
	
	@ValueConverter(rule = "AREDUCTION_OP")
	public IValueConverter<REDUCTION_OP> reductionOp() {
		return new IValueConverter<REDUCTION_OP> () {

			@Override
			public REDUCTION_OP toValue(String string, INode node) throws ValueConverterException {
				if (string.contentEquals("+")) {
					return REDUCTION_OP.SUM;
				}

				if (string.contentEquals("*")) {
					return REDUCTION_OP.PROD;
				}

				return REDUCTION_OP.getByName(string);
			}

			@Override
			public String toString(REDUCTION_OP value) throws ValueConverterException {
				if (value == REDUCTION_OP.SUM) {
					return "+";
				}
				if (value == REDUCTION_OP.PROD) {
					return "*";
				}
				
				return value.getName();
			}
			
		};
	}

}
