package org.demo;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {
    Calculator calculator=null;
    private TestCase Assertions;

    @Before
    public void setup(){
        calculator=new Calculator();
    }
    @After
    public void tearDown(){
        calculator=null;
    }

    @Test
    public void givenAdd(){
        Assertions.assertEquals(50,calculator.add(20,30));
    }

    @Test
    public void givenSubtract(){
        Assertions.assertEquals(10,calculator.subtract(30,20));
    }
    @Test
    public void givenMultiply(){
        Assertions.assertEquals(48,calculator.multiply(12,4));
    }

    @Test
    public void givenDivide(){
        Assertions.assertEquals(4,calculator.divide(20,5));
    }

    @Test
    public void givenModulo(){
        Assertions.assertEquals(3,calculator.modulo(11,4));
    }


}
