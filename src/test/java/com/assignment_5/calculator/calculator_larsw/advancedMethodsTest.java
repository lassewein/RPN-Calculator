package com.assignment_5.calculator.calculator_larsw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.assignment_5.calculator.operations.CalculatorAdvanceOperations;

public class advancedMethodsTest {

	CalculatorAdvanceOperations calcAdvancedOperations = new CalculatorAdvanceOperations();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(CalculatorAdvanceOperations.class.getName());

	// * ********************************************//
	// * ----------Start of Square test ---------- *//
	// * ********************************************//
	@Test
	public void testCalculatorSquare() {
		double tempRandomValue = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue = random.nextDouble() * 100;

			tempResult = tempRandomValue * tempRandomValue;
			LOG.info("Testing the method square with " + tempRandomValue);
			assertEquals(calcAdvancedOperations.square(tempRandomValue), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorSquareNegative() {
		double tempRandomValue = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue = random.nextDouble() * -100;
			tempResult = tempRandomValue * tempRandomValue;
			LOG.info("Testing the method square with " + tempRandomValue);
			assertEquals(calcAdvancedOperations.square(tempRandomValue), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorSquareZero() {
		double tempRandomValue = 0;
		double tempResult = 0;
		tempResult = tempRandomValue * tempRandomValue;
		LOG.info("Testing the method square with " + tempRandomValue);
		assertEquals(calcAdvancedOperations.square(tempRandomValue), tempResult, 0);

	}

	// * ********************************************//
	// * ---------- End of Square test ---------- *//
	// * ********************************************//

	// * ********************************************//
	// * ----------Start of PowerOf test ---------- *//
	// * ********************************************//
	@Test
	public void testCalculatorPowerOf() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * 100;
			tempRandomValue2 = random.nextDouble() * 10;
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			LOG.info("Testing the method powerOf with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcAdvancedOperations.powerOf(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorPowerOfBaseNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * 10;
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			LOG.info("Testing the method powerOf with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcAdvancedOperations.powerOf(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorPowerOfExponentNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * 100;
			tempRandomValue2 = random.nextDouble() * -10;
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			LOG.info("Testing the method powerOf with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcAdvancedOperations.powerOf(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorPowerOfTwoNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * -10;
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			LOG.info("Testing the method powerOf with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcAdvancedOperations.powerOf(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorPowerOfOneZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			LOG.info("Testing the method powerOf with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcAdvancedOperations.powerOf(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorPowerOfTwoZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
		LOG.info("Testing the method powerOf with " + tempRandomValue1 + " and " + tempRandomValue2);
		assertEquals(calcAdvancedOperations.powerOf(tempRandomValue1, tempRandomValue2), tempResult, 0);

	}
	// * ********************************************//
	// * ---------- End of PowerOf test ----------. *//
	// * ********************************************//

	// * **********************************************//
	// * ----------Start of SquareRoot test ----------*//
	// * **********************************************//
	@Test
	public void testCalculatorSquareRoot() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0.5;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * 100;
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			LOG.info("Testing the method squareRoot with " + tempRandomValue1);
			assertEquals(calcAdvancedOperations.squareRoot(tempRandomValue1), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorSquareRootNegative() {
		double tempRandomValue1 = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			LOG.info("Testing the method squareRoot with " + tempRandomValue1);
			try {
				calcAdvancedOperations.squareRoot(tempRandomValue1);
				fail("Square root must be a positiv number!");
			} catch (ArithmeticException arrExc) {
				assertTrue(arrExc.getMessage(), true);
			}
		}
	}

	@Test
	public void testCalculatorSquareRootBaseZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0.5;
		double tempResult = 0;

		tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
		LOG.info("Testing the method squareRoot with " + tempRandomValue1);
		assertEquals(calcAdvancedOperations.squareRoot(tempRandomValue1), tempResult, 0);
	}

	// * ***********************************************//
	// * ---------- End of SquareRoot test ---------- *//
	// * ***********************************************//

	// * *************************************************//
	// * ----------Start of NthSquareRoot test ----------*//
	// * *************************************************//
	@Test
	public void testCalculatorNthSquareRoot() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * 100;
			tempRandomValue2 = random.nextDouble() * 10;
			tempResult = Math.pow(tempRandomValue1, 1 / tempRandomValue2);
			LOG.info("Testing the method nthSquareRoot with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcAdvancedOperations.nthSquareRoot(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorNthSquareRootBaseNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * 10;
			LOG.info("Testing the method nthSquareRoot with " + tempRandomValue1 + " and " + tempRandomValue2);
			try {
				calcAdvancedOperations.nthSquareRoot(tempRandomValue1, tempRandomValue2);
				fail("Square root must be a positiv number!");
			} catch (ArithmeticException arrExc) {
				assertTrue(arrExc.getMessage(), true);
			}
		}

	}

	@Test
	public void testCalculatorNthSquareRootExponentNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * 100;
			tempRandomValue2 = random.nextDouble() * -10;
			tempResult = Math.pow(tempRandomValue1, 1 / tempRandomValue2);
			LOG.info("Testing the method nthSquareRoot with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcAdvancedOperations.nthSquareRoot(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorNthSquareRootTwoNegative() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * -100;
			tempRandomValue2 = random.nextDouble() * -10;
			LOG.info("Testing the method squareRoot with " + tempRandomValue1);
			try {
				calcAdvancedOperations.squareRoot(tempRandomValue1);
				fail("Square root must be a positiv number!");
			} catch (ArithmeticException arrExc) {
				assertTrue(arrExc.getMessage(), true);
			}
		}
	}

	@Test
	public void testCalculatorNthSquareRootExponentZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue1 = random.nextDouble() * 100;
			tempResult = Math.pow(tempRandomValue1, 1 / tempRandomValue2);
			LOG.info("Testing the method nthSquareRoot with " + tempRandomValue1 + " and " + tempRandomValue2);
			assertEquals(calcAdvancedOperations.nthSquareRoot(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorNthSquareRootTwoZero() {
		double tempRandomValue1 = 0;
		double tempRandomValue2 = 0;
		double tempResult = 0;

		tempResult = Math.pow(tempRandomValue1, 1 / tempRandomValue2);
		LOG.info("Testing the method nthSquareRoot with " + tempRandomValue1 + " and " + tempRandomValue2);
		try {
			calcAdvancedOperations.squareRoot(tempRandomValue1);
			fail("Square root must be a positiv number!");
		} catch (ArithmeticException arrExc) {
			assertTrue(arrExc.getMessage(), true);
		}
	}

	// * **************************************************//
	// * ---------- End of NthSquareRoot test ---------- *//
	// * **************************************************//

	// * ***************************************//
	// * ----------Start of Log test ----------*//
	// * ***************************************//
	@Test
	public void testCalculatorLog() {
		double tempRandomValue = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue = random.nextDouble() * 100;
			tempResult = Math.log(tempRandomValue);
			LOG.info("Testing the method Log with " + tempRandomValue);
			assertEquals(calcAdvancedOperations.log(tempRandomValue), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorLogNegative() {
		double tempRandomValue = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue = random.nextDouble() * -100;
			LOG.info("Testing the method log with " + tempRandomValue);
			try {
				calcAdvancedOperations.log(tempRandomValue);
				fail("Must be a positiv number!");
			} catch (ArithmeticException arrExc) {
				assertTrue(arrExc.getMessage(), true);
			}
		}
	}

	@Test
	public void testCalculatorLogZero() {
		double tempRandomValue = 0;

		LOG.info("Testing the method log with " + tempRandomValue);
		try {
			calcAdvancedOperations.log(tempRandomValue);
			fail("Must be a positiv number!");
		} catch (ArithmeticException arrExc) {
			assertTrue(arrExc.getMessage(), true);
		}

	}

	// * ****************************************//
	// * ---------- End of Log test ---------- *//
	// * ****************************************//

	// * ***************************************//
	// * ----------Start of TenPowerOf test ----------*//
	// * ***************************************//
	@Test
	public void testCalculatorTenPowerOf() {
		double tempRandomValue = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue = random.nextDouble() * 100;
			tempResult = Math.pow(10, tempRandomValue);
			LOG.info("Testing the method tenPowerOf with " + tempRandomValue);
			assertEquals(calcAdvancedOperations.tenPowerOf(tempRandomValue), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorTenPowerOfNegative() {
		double tempRandomValue = 0;
		double tempResult = 0;

		for (int i = 0; i < 51; i++) {
			tempRandomValue = random.nextDouble() * -100;

			tempResult = Math.pow(10, tempRandomValue);
			LOG.info("Testing the method tenPowerOf with " + tempRandomValue);
			assertEquals(calcAdvancedOperations.tenPowerOf(tempRandomValue), tempResult, 0);
		}
	}

	@Test
	public void testCalculatorTenPowerOfZero() {
		double tempRandomValue = 0;
		double tempResult = 0;

		tempResult = Math.pow(10, tempRandomValue);
		LOG.info("Testing the method tenPowerOf with " + tempRandomValue);
		assertEquals(calcAdvancedOperations.tenPowerOf(tempRandomValue), tempResult, 0);

	}
	// * **********************************************//
	// * ---------- End of TenPowerOf test ---------- *//
	// * **********************************************//
}
