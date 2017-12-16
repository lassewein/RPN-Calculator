/**
 * 
 */
package com.assignment_5.calculator.calculator_larsw;

import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;
import com.assignment_5.calculator.operations.CalculatorBasicOperations;
import junit.framework.TestCase;

/**
 * @author lars
 *
 */
public class basicMethodsTest extends TestCase {

	CalculatorBasicOperations calcBasicOperations = new CalculatorBasicOperations();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(CalculatorBasicOperations.class.getName());

	// * ********************************************//
	// *                                            *//
	// * ----------Start of Addition test ----------*//
	// *                                            *//
	// * ********************************************//
	@Test
	public void testCalculatorAdd() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * 100;
			tempRandomValue2 = random.nextDouble() * 100;
			tempResult = tempRandomValue1 + tempRandomValue2;
			LOG.info("Testing the method calculatorAdd with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorAdd(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorAddOneNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * 100;
			tempResult = tempRandomValue1 + tempRandomValue2;
			LOG.info("Testing the method calculatorAdd with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorAdd(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorAddTwoNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * -100;
			tempResult = tempRandomValue1 + tempRandomValue2;
			LOG.info("Testing the method calculatorAdd with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorAdd(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorAddOneZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempResult = tempRandomValue1 + tempRandomValue2;
			LOG.info("Testing the method calculatorAdd with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorAdd(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorAddTwoZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		tempResult = tempRandomValue1 + tempRandomValue2;
		LOG.info("Testing the method calculatorAdd with " + tempRandomValue1 + " and " + tempRandomValue2);
		assertEquals(calcBasicOperations.calculatorAdd(tempRandomValue1, tempRandomValue2), tempResult, 0);

	}
	// * ********************************************//
	// *                                            *//
	// * ---------- End of Addition test ---------- *//
	// *                                            *//
	// * ********************************************//

	// * ************************************************//
	// *                                                *//
	// * ---------- Start of Subtraction test ----------*//
	// *                                                *//
	// * ************************************************//
	@Test
	public void testCalculatorSubtract() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * 100;
			tempRandomValue2 = random.nextDouble() * 100;
			tempResult = tempRandomValue1 - tempRandomValue2;
			LOG.info("Testing the method calculatorSubtract with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorSubtract(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorSubtractOneNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * 100;
			tempResult = tempRandomValue1 - tempRandomValue2;
			LOG.info("Testing the method calculatorSubtract with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorSubtract(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorSubtractTwoNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * -100;
			tempResult = tempRandomValue1 - tempRandomValue2;
			LOG.info("Testing the method calculatorSubtract with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorSubtract(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorSubtractOneZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempResult = tempRandomValue1 - tempRandomValue2;
			LOG.info("Testing the method calculatorSubtract with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorSubtract(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorSubtractTwoZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		tempResult = tempRandomValue1 - tempRandomValue2;
		LOG.info("Testing the method calculatorSubtract with " + tempRandomValue1 + " and " + tempRandomValue2);
		assertEquals(calcBasicOperations.calculatorSubtract(tempRandomValue1, tempRandomValue2), tempResult, 0);

	}
	// * **********************************************//
	// *                                              *//	
	// * ---------- End of Subtraction test ----------*//
	// *                                              *//
	// * **********************************************//

	// * ***************************************************//
	// *                                                   *//
	// * ---------- Start of Multiplication test ----------*//
	// *                                                   *//
	// * ***************************************************//
	@Test
	public void testcalculatorMultiplication() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * 100;
			tempRandomValue2 = random.nextDouble() * 100;
			tempResult = tempRandomValue1 * tempRandomValue2;
			LOG.info("Testing the method calculatorMultiplication with " + tempRandomValue1 + " and "
					+ tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorMultiplication(tempRandomValue1, tempRandomValue2), tempResult,
					0);
		}
	}

	@Test
	public void testCalculatorMultiplicationOneNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * 100;
			tempResult = tempRandomValue1 * tempRandomValue2;
			LOG.info("Testing the method calculatorMultiplication with " + tempRandomValue1 + " and "
					+ tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorMultiplication(tempRandomValue1, tempRandomValue2), tempResult,
					0);
		}
	}

	@Test
	public void testCalculatorMultiplicationTwoNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * -100;
			tempResult = tempRandomValue1 * tempRandomValue2;
			LOG.info("Testing the method calculatorMultiplication with " + tempRandomValue1 + " and "
					+ tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorMultiplication(tempRandomValue1, tempRandomValue2), tempResult,
					0);
		}
	}

	@Test
	public void testCalculatorMultiplicationtOneZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempResult = tempRandomValue1 * tempRandomValue2;
			LOG.info("Testing the method calculatorMultiplication with " + tempRandomValue1 + " and "
					+ tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorMultiplication(tempRandomValue1, tempRandomValue2), tempResult,
					0);
		}
	}

	@Test
	public void testCalculatorMultiplicationTwoZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		tempResult = tempRandomValue1 * tempRandomValue2;
		LOG.info("Testing the method calculatorMultiplication with " + tempRandomValue1 + " and " + tempRandomValue2);
		assertEquals(calcBasicOperations.calculatorMultiplication(tempRandomValue1, tempRandomValue2), tempResult, 0);

	}
	// * *************************************************//
	// *                                                 *//
	// * ---------- End of Multiplication test ----------*//
	// *                                                 *//
	// * *************************************************//

	// * *********************************************//
	// *                                             *//
	// * ---------- Start of Division test ----------*//
	// *                                             *//
	// * *********************************************//
	@Test
	public void testcalculatorDivision() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * 100;
			tempRandomValue2 = random.nextDouble() * 100;
			tempResult = tempRandomValue1 / tempRandomValue2;
			LOG.info("Testing the method calculatorDivision with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorDivision(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorDivisionOneNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * 100;
			tempResult = tempRandomValue1 / tempRandomValue2;
			LOG.info("Testing the method calculatorDivision with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorDivision(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorDivisionTwoNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * -100;
			tempResult = tempRandomValue1 / tempRandomValue2;
			LOG.info("Testing the method calculatorDivision with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorDivision(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorDivisionDividenZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue2 = random.nextDouble() * -100;
			tempResult = tempRandomValue1 / tempRandomValue2;
			LOG.info("Testing the method calculatorDivision with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcBasicOperations.calculatorDivision(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}
	
	@Test 
	public void testCalculatorDivisionDivisorZero() {
		
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			LOG.info("Testing the method calculatorDivision with " + tempRandomValue1 + " and " + tempRandomValue2);
			try {
				calcBasicOperations.calculatorDivision(tempRandomValue1, tempRandomValue2);
		        fail("Division by zero is illegal!");
		    } catch (ArithmeticException arrExc) {
		        assertTrue(arrExc.getMessage(), true);
		    }
			
		}

	}


	@Test
	public void testCalculatorDivisionTwoZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		
		LOG.info("Testing the method calculatorDivision with " + tempRandomValue1 + " and " + tempRandomValue2);
		try {
			calcBasicOperations.calculatorDivision(tempRandomValue1, tempRandomValue2);
	        fail("Division by zero is illegal!");
	    } catch (ArithmeticException arrExc) {
	        assertTrue(arrExc.getMessage(), true);
	    }

	}
	
	// * ********************************************//
	// *                                            *//
	// * ----------End of Division test ------------*//
	// *                                            *//
	// * ********************************************//

	// * ********************************************//
	// *                                            *//
	// * ----------Start of Negative test-----------*//
	// *                                            *//
	// * ********************************************//
	@Test
	public void testcalculatorNegative() {
		double tempRandomValue = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue = random.nextDouble() * 100;
			tempResult = tempRandomValue * -1;
			LOG.info("Testing the method calculatorNegative with " + tempRandomValue);
			assertEquals(calcBasicOperations.calculatorNegative(tempRandomValue), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorNegativeOneNegative() {
		double tempRandomValue = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue = random.nextDouble() * -100;
			tempResult = tempRandomValue * -1;
			LOG.info("Testing the method calculatorNegative with " + tempRandomValue);
			assertEquals(calcBasicOperations.calculatorNegative(tempRandomValue), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorNegativeZero() {
		double tempRandomValue = 0;
		double tempResult = 0;

		tempResult = tempRandomValue * -1;
		LOG.info("Testing the method calculatorNegative with " + tempRandomValue);
		assertEquals(calcBasicOperations.calculatorNegative(tempRandomValue), tempResult, 0);
	}
	// * ********************************************//
	// *                                            *//
	// * ---------- End of Negative test -----------*//
	// *                                            *//
	// * ********************************************//
}
