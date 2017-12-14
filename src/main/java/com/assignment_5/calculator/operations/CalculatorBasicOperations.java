/**
 * 
 */
package com.assignment_5.calculator.operations;

import com.assignment_5.calculator.interfaces.CalculatorBasicOperationsInterface;

/**
 * @author lars
 *
 */
public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {

	/* (non-Javadoc)
	 * @see com.assignment_5.calculator.interfaces.CalculatorBasicOperationsInterface#calculatorAdd(double, double)
	 */
	public double calculatorAdd(double a, double b) {
		double result = a + b;
		return result;
	}


	/* (non-Javadoc)
	 * @see com.assignment_5.calculator.interfaces.CalculatorBasicOperationsInterface#calculatorSubtract(double, double)
	 */
	public double calculatorSubtract(double a, double b) {
		double result = a - b; 
		return result;
	}


	/* (non-Javadoc)
	 * @see com.assignment_5.calculator.interfaces.CalculatorBasicOperationsInterface#calculatorMultiplication(double, double)
	 */
	public double calculatorMultiplication(double a, double b) {
		double result = a * b;
		return result;
	}

	/* (non-Javadoc)
	 * @see com.assignment_5.calculator.interfaces.CalculatorBasicOperationsInterface#calculatorDivision(double, double)
	 */
	public double calculatorDivision(double a, double b) {
		double result = a / b;
		return result;
	}
	
	/* (non-Javadoc)
	 * @see com.assignment_5.calculator.interfaces.CalculatorBasicOperationsInterface#calculatorDivision(double, double)
	 */
	public double calculatorNegative(double a) {
		double result = -a;
		return result;
	}


}
