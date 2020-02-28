package calctest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import calccode.calculator;

public class test {

	   private static calculator object;
	    
			@BeforeAll
			static void setUpBeforeClass() throws Exception {
				object=new calculator();
			}

			@AfterAll
			static void tearDownAfterClass() throws Exception {
			}

			@BeforeEach
			void setUp() throws Exception {
			}

			@AfterEach
			void tearDown() throws Exception {
			}
			
			
			@Test
			void testAdd_TwoPositiveInt_positive() {
				// Arrange
				int a = 1;
				int b = 2;
				
				// Act
				int actual = object.add(a,b);
				
				// Assert
				assertTrue(actual==3);
				
			}
			
			@Test
			void testAdd_TwonegativeInt_negative() {
				// Arrange
				int a = -1;
				int b = -2;
				// Act
				int actual=object.add(a,b);
				// Assert
				assertTrue(actual==-3);
				
			}
			@Test
			void testAdd_PositiveNegativeInt_negative() {
				// Arrange
				int a = 1;
				int b = -2;
				// Act
				int actual=object.add(a,b);
				// Assert
				assertTrue(actual==-1);
				
			}
			@Test
			void testAdd_PositiveNegativeInt_positive() {
				// Arrange
				int a = -1;
				int b = 2;
				// Act
				int actual=object.add(a,b);
				// Assert
				assertTrue(actual==1);
				
			}
			@Test
			void testAdd_TwoPositiveNegativeEqualInt_zero() {
				// Arrange
				int a = -1;
				int b = 1;
				// Act
				int actual=object.add(a,b);
				// Assert
				assertTrue(actual==0);
				
			}

		}

