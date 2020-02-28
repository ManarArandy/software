package calctest;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calccode.calculator;

public class testtTest {
	 private static calculator object;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		object=new calculator();
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
	public void testAdd_TwoPositiveInt_positive() {
		// Arrange
		int a = 1;
		int b = 2;
		
		// Act
		int actual = object.add(a,b);
		
		// Assert
		assertTrue(actual==3);
		
	}
	
	@Test
	public void testAdd_TwonegativeInt_negative() {
		// Arrange
		int a = -1;
		int b = -2;
		// Act
		int actual=object.add(a,b);
		// Assert
		assertTrue(actual==-3);
		
	}
	@Test
	public void testAdd_PositiveNegativeInt_negative() {
		// Arrange
		int a = 1;
		int b = -2;
		// Act
		int actual=object.add(a,b);
		// Assert
		assertTrue(actual==-1);
		
	}
	@Test
	public void testAdd_PositiveNegativeInt_positive() {
		// Arrange
		int a = -1;
		int b = 2;
		// Act
		int actual=object.add(a,b);
		// Assert
		assertTrue(actual==1);
		
	}
	@Test
	public void testAdd_TwoPositiveNegativeEqualInt_zero() {
		// Arrange
		int a = -1;
		int b = 1;
		// Act
		int actual=object.add(a,b);
		// Assert
		assertTrue(actual==0);
		
	}

}
