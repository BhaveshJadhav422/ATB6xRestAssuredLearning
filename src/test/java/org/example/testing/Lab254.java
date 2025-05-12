package org.example.testing;

import org.testng.annotations.*;

public class Lab254 {

    @BeforeSuite
    void demo(){
        System.out.println("Before Suite");
        System.out.println("Open Database");
        System.out.println("Read CSV or Excel");
        System.out.println("Read Text/Env");
    }

    @BeforeTest
    void demo2(){
        System.out.println("Before Test");
    }

    @BeforeClass
    void demo3(){
        System.out.println("Before class");
    }

    @BeforeMethod
    void demo4(){
        System.out.println("Before Method");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterMethod
    void demo6(){
        System.out.println("After method");
    }

    @AfterClass
    void demo7(){
        System.out.println("After class");
    }

    @AfterTest
    void demo8(){
        System.out.println("After Test");
    }

    @AfterSuite
    void demo9(){
        System.out.println("After suite");
        System.out.println("Close DB Connection");
        System.out.println("Close Open files");
    }
}
