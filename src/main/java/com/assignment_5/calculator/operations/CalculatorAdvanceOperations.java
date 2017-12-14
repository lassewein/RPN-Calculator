package com.assignment_5.calculator.operations;

import com.assignment_5.calculator.interfaces.CalculatorAdvancedOperationsInterface;
//import java.lang.Math;

/**
 * @author lars
 *
 */
public class CalculatorAdvanceOperations implements CalculatorAdvancedOperationsInterface {

	public double square(double a) {
		return Math.pow(a, 2);
	}

	public double powerOf(double b, double e) {
		return Math.pow(b, e);
	}

	public double squareRoot(double a) {
		return Math.sqrt(a);
	}

	public double nthSquareRoot(double a, double e) {
		return Math.pow(a, 1/e);
	}

	public double log(double a) {
		return Math.log(a);
	}

	public double tenPowerOf(double e) {
		return Math.pow(10, e);
	}

}
