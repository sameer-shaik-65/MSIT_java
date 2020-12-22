package cglgame;

import static org.junit.Assert.*;
import org.junit.Test;



public class TestDriver {
   @Test
   public void testAddPass() {
      
	 //passing test cases for addition 

	   
      assertEquals("error in add()",  3, cglgame.add(1, 2));
      assertEquals("error in add()", 100, cglgame.add(99, 1));
      assertEquals("error in add()",  20, cglgame.add(9, 11));
      
      System.out.println("All Test cases passed for  addition");
   }
 
   @Test
   public void testAddFail() {
      
	   
	 //failing test cases for addition
	   
      assertNotEquals("error in add()", 0, cglgame.add(1, 2));
      
      System.out.println(" 1 Test cases failed because 1 + 2  is 3 we have given 0");
   }
 
   @Test
   public void testSubPass() {
	   
	   //passing test cases for substraction
	   
      assertEquals("error in sub()",  1, cglgame.sub(2, 1));
      assertEquals("error in sub()", -1, cglgame.sub(-2, -1));
      assertEquals("error in sub()",  0, cglgame.sub(2, 2));
      
      System.out.println("Test cases passed for  substraction");
      
   }
 
   @Test
   public void testSubFail() {
	   
	 //passing test cases for substraction
	   
	   
      assertNotEquals("error in sub()", 0, cglgame.sub(2, 1));
      
      System.out.println("1 Test cases failed for  substraction 2 -1  is 1 given result is 0");
   }
}