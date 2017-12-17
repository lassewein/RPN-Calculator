package com.assignment_5.calculator.operations;

import com.assignment_5.calculator.interfaces.CalculatorBasicOperationsInterface;

/**
 * Class CalculatorBasicOperations for handling basic mathematical operations
 * 	e.g. +, -, * a.s.o.
 *      
 * @author Lars Weingartner
 * @version 1.0
 * 
 */
public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {

	/**
	 * calculate a addeted with b
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param a the first number
	 * @param b the second number
	 * @return result the sum of a and b
	 * 
	 */
	public double calculatorAdd(double a, double b) {
		double result = a + b;
		return result;
	}

	/**
	 * calculate a subtracted with b
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param a the first number
	 * @param b the second number
	 * @return result the remainer after subtraction
	 * 
	 */
	public double calculatorSubtract(double a, double b) {
		double result = a - b; 
		return result;
	}

	/**
	 * calculate a multiplied with b
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param a the first number
	 * @param b the second number
	 * @return result the product
	 * 
	 */
	public double calculatorMultiplication(double a, double b) {
		double result = a * b;
		return result;
	}

	/**
	 * calculate a devided by b
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param a the divident
	 * @param b the divider
	 * @return result ofthe division
	 * @exception ArithmeticException if the number zero
	 * 
	 */
	public double calculatorDivision(double a, double b) {
		double result;
		if (b == 0.0) {
			throw new ArithmeticException("Division by zero is illegal!");
		} else {
			result = a / b;
		}
		return result;
	}
	
	/**
	 * Change a positiv number to a negative one and vise versa
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param a the number to change
	 * @return result the negative number
	 * 
	 */
	public double calculatorNegative(double a) {
		double result = -a;
		return result;
	}

}
