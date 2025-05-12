package org.example.ex_ra01;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab253 {
    @Description("TC#1- Verify 251 GET request 1")
    @Test
    public void getMethod(){
        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(201);
    }
}
