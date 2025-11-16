package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTest{
    @Test (groups = {"BasicOperations"})
    public void addTest(){
        Calculator c1 = new Calculator();

        Assert.assertEquals(c1.add(7,4),11);
    }

    @Test (groups = {"BasicOperations"})
    public void subtractTest(){
        Calculator c1 = new Calculator();

        Assert.assertEquals(c1.subtract(7,4),3);
    }

    @Test (groups = {"AdvancedOperations"})
    public void multiplyTest(){
        Calculator c1 = new Calculator();

        Assert.assertEquals(c1.multiply(7,4),28);
    }

    @Test (groups = {"AdvancedOperations"})
    public void divideTest(){
        Calculator c1 = new Calculator();

        Assert.assertEquals(c1.divide(8,4),2);
    }
    
}

/*package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator c1 = new Calculator();

        Assert.assertEquals(4, c1.add(3,1));
    }
}*/


