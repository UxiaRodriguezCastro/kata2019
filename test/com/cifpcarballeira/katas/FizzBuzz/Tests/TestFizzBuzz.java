
package com.cifpcarballeira.katas.FizzBuzz.Tests;

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM124
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }

 @Test
     public void tes1devuelve1() {
     FizzBuzz fb= new FizzBuzz();
     String result= fb.getFizzBuzz(1);
     assertEquals ("1",result);
     
     
     }
}
