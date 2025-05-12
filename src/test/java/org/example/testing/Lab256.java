package org.example.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab256 {

    @Test
    public void testcase1(){
        Assert.assertEquals(true,true);
        System.out.println("End of the program");
    }

    @Test
    public void testcase2(){
        Assert.assertEquals(false,true);
    }
}
