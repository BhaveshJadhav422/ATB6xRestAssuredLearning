package org.example.testing;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab251 {
    //Why we need TestNG
    //We have 1000 TC- so to group them
    //To seperate smoke and sanity Testcases
    //Before and after executing TC we can do smtg

    @Description("TC#1- Verify 251 GET request 1")
    @Test
    public void getMethod(){
        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(201);
    }


    @Description("TC#1- Verify 251 GET request 2")
    @Test
    public void getMethod2(){
        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(201);
    }
}
