package com.example;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalculatorTest{

    @BeforeClass
    public void initial(){
        System.out.println("Initiatee Tests");
    }

    @AfterClass
    public void last(){
        System.out.println("End of Tests");
    }

    @DataProvider(name="dforAdd")
    public Object [][] dforAdd(){
        return new Object[][]{
            {1,2,3},
            {2,3,5},
            {3,3,6}
        };
    }

    @Test (groups = {"BasicOperations"},dataProvider="dforAdd")
    public void addTest(int a, int b, int exp){
        Calculator c1 = new Calculator();

        Assert.assertEquals(c1.add(a,b),exp);
    }

    @Test (groups = {"BasicOperations"}, priority=2)
    public void subtractTest(){
        Calculator c1 = new Calculator();

        Assert.assertEquals(c1.subtract(7,4),3);
    }

    @Test (groups = {"AdvancedOperations"}, priority=1)
    public void multiplyTest(){
        Calculator c1 = new Calculator();

        Assert.assertEquals(c1.multiply(7,4),28);
    }

    @Test (groups = {"AdvancedOperations"}, dependsOnMethods={"multiplyTest"})
    public void divideTest(){
        Calculator c1 = new Calculator();

        Assert.assertEquals(c1.divide(8,4),2);
    }
    
}




