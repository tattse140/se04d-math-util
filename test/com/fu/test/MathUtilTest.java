/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.test;

import com.fu.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BiV
 */
public class MathUtilTest {
    @Test
   public void testFactorialGivenRightArgumentReturnsGoodResult(){
       int n = 5; // test 5! co cung la 120 hay k
       long expected = 120;
       long actual = MathUtility.getFactorial(n);
       assertEquals(expected, actual);
   
   }
    
}
