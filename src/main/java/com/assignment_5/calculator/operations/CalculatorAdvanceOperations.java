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
	 * 
	 */
	public double squareRoot(double a) {
		return Math.sqrt(a);
	}

	/**
	 * nthSquareRoot calculate the square root of a to the power of e
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param a the base to calculate
	 * @param e the power of root, e.g 1/e
	 * @return result calculated to the n:th square root of a
	 * 
	 */
	public double nthSquareRoot(double a, double e) {
		return Math.pow(a, 1/e);
	}

	/**
	 * log calculate the ten:th loggaritm of a
	 * 
	 * @author Lars Weingartner
	 * @version 1.0
	 * @param a the base to calculate
	 * @return result ten:th logaritm
	 * 
	 */
	public double log(double a) {
		return Math.log(a);
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
