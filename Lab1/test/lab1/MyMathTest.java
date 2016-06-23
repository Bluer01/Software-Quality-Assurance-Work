/**
 * 
 */
package lab1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author Bluer
 *
 */
public class MyMathTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("@After");

	}

	/**
	 * Test method for (@link {@link lab1.MyMath#div(int, int)}.
	 */
	@Test
	public void testDivPass() {
		System.out.println( "@Test: testDivPass" );
		int number1 = 12;
		int number2 = 3;
		int expected = 4;
		Assert.assertEquals(expected, MyMath.div(number1, number2));
	}
	
	@Test
	public void testDivFail() {
		System.out.println( "@Test: testDivFail" );
		int number1 = 8;
		int number2 = 4;
		int expected = 3;
		Assert.assertEquals(expected, number1, number2);
	}
	
	@Test
	public void testDivError() {
		System.out.println( "@Test: testDivError" );
		int number1 = 3;
		int number2 = 0;
		MyMath.div(number1, number2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivException() {
		System.out.println( "@Test: testDivException" );
		int number1 = 10;
		int number2 = 0;
		MyMath.div(number1, number2);
	}
	
}
