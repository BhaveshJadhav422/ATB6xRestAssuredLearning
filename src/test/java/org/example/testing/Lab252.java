package org.example.testing;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Lab252 {

        @Description("TC#1- Verify GET request 1")
        @Test
        public void getrequest(){
            System.out.println("TC1");
        }

    @Description("TC#1- Verify GET request 2")
        @Test
        public void getrequest2() {
            System.out.println("TC2");
        }

    @Description("TC#1- Verify GET request 3")
        @Test
            public void getrequest3 (){
                System.out.println("TC3");
            }
    }


