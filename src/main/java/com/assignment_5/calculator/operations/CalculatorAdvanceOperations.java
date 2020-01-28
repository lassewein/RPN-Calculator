package com.assignment_5.calculator.operations;

import com.assignment_5.calculator.interfaces.CalculatorAdvancedOperationsInterface;
/**
 * Class CalculatorAdvanceOperations for handling advanced mathematical operations
 * 	e.g. x^y, square root of x a.s.o.
 *      
 * @author Lars Weingartner
 * @version 1.0
 * 
 */
public class CalculatorAdvanceOperations implements CalculatorAdvancedOperationsInterface {
	
	/**
	 * square calculate the base b to the power of 2
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param b the base to calculate
	 * @return result
	 * 
	 */
	public double square(double b) {
		return Math.pow(b, 2);
	}
	
	/**
	 * powerOf calculate the base b to the power of e
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param b the base to calculate
	 * @param e the exponent to use in the 
	 * @return result 
	 * 
	 */
	public double powerOf(double b, double e) {
		return Math.pow(b, e);
	}

	/**
	 * squareRoot calculate the square root of a
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param a the variable to calculate
	 * @return result calculated to the square root 
	 * @exception ArithmeticException if the number is less than zero
	 * 
	 */
	public double squareRoot(double a) {
		double result;	
		if (a < 0.0) {
			throw new ArithmeticException("Square root must be a positiv number!");
		} else {
			result = Math.sqrt(a);
		}
		return result;
	}

	/**
	 * nthSquareRoot calculate the square root of a to the power of e
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param a the base to calculate
	 * @param e the power of root, e.g 1/e
	 * @return result calculated to the n:th square root of a
	 * @exception ArithmeticException if the number is less than zero and the n:th root is even
	 */
	public double nthSquareRoot(double a, double e) {
		double result;	
		if (a < 0.0 || e == 0) {
			throw new ArithmeticException("Square root must be a positiv number!");
		} else {
			result = Math.pow(a, 1/e);
		}
		return result;
	}

	/**
	 * log calculate the ten:th loggaritm of a
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param a the variable to calculate
	 * @return result calculated to the square root 
	 * @exception ArithmeticException if the number is zero or less than zero
	 *
	 */
	public double ln(double a) {
		double result;	
		if (a <= 0.0) {
			throw new ArithmeticException("It must be a positiv number!");
		} else {
			result = Math.log(a);
		}
		return result;
		
	}
	
	/**
	 * Invers function of log
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param e the power to the 10:th base
	 * @return result calculated result
	 * 
	 */
	public double tenPowerOf(double e) {
		return Math.pow(10, e);
	}

}
