
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
 @Test
     public void tes2devuelve2() {
     FizzBuzz fb= new FizzBuzz();
     String result= fb.getFizzBuzz(2);
     assertEquals ("2",result);
     
     
     }
           @Test
     public void test3devuelveFizz() {
     FizzBuzz fb= new FizzBuzz();
     String result= fb.getFizzBuzz(3);
     assertEquals ("Fizz",result);
     
     
     }
               @Test
     public void test5devuelveBuzz() {
     FizzBuzz fb= new FizzBuzz();
     String result= fb.getFizzBuzz(5);
     assertEquals ("Buzz",result);
     
     
     }
                    @Test
     public void testmultiplo3y5devuelveFixxBuzz() {
     FizzBuzz fb= new FizzBuzz();
     String result= fb.getFizzBuzz(15);
     assertEquals ("FizzBuzz",result);
     
     
     }
          public void testcontiene3() {
     FizzBuzz fb= new FizzBuzz();
     String result= fb.getFizzBuzz(13);
     assertEquals ("Fizz",result);

}
}