package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisEven() {
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(5));
		
	int iIntegerTestValue = 2;
	MyInteger instance = new MyInteger(iIntegerTestValue);
	boolean bExpectedresult = true;
	boolean bActualResult = instance.isEven();
	assertEquals("testIsEven() failed",bExpectedresult,bActualResult);

	}
	
	@Test
	public void testisOdd() {
		assertTrue(MyInteger.isOdd(5));
		assertFalse(MyInteger.isOdd(4));

	int iIntegerTestValue = 5;
	MyInteger instance = new MyInteger(iIntegerTestValue);
	boolean bExpectedresult = true;
	boolean bActualResult = instance.isOdd();
	assertEquals("testIsOdd() failed",bExpectedresult,bActualResult);

	}
	
	@Test
	public void testisPrime() {
		assertFalse(MyInteger.isPrime(1));
		assertFalse(MyInteger.isPrime(12));
		assertFalse(MyInteger.isPrime(6));
		assertTrue(MyInteger.isPrime(7));

	int iIntegerTestValue = 3;
	MyInteger instance = new MyInteger(iIntegerTestValue);
	boolean bExpectedresult = true;
	boolean bActualResult = instance.isPrime();
	assertEquals("testIsPrime() failed",bExpectedresult,bActualResult);
	
	MyInteger a = new MyInteger(5);
	assertTrue(MyInteger.isPrime(a));
	}
	
	@Test
	public void testisEqual() {
		MyInteger a = new MyInteger(4);
		assertTrue(a.equals(4));
		assertFalse(a.equals(7));
		
		assertTrue(a.equals(a));
	}
}
