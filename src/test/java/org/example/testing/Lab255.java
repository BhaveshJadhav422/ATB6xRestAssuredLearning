package org.example.testing;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab255 {


    @Description("TC#1")
    @Test
    public void testcase(){
        //Assertion means actual result==expected result
        // 2 types of assertion in TestNG
        //1. Soft Assertion
        //2.Hard Assertion

        SoftAssert s= new SoftAssert();
        s.assertEquals("Bhavesh","Bhav","Not equal");
        System.out.println("End of the program");
        s.assertAll();

        Assert.assertEquals("Bhavesh","Jadhav");
        System.out.println("End of the program");

    }
}
