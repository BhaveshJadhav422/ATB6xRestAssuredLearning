package org.example.ex_ra01;

import io.restassured.RestAssured;

public class Lab250 {
    public static void main(String[] args) {

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(201);
    }
}
