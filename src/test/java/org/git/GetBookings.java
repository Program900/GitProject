package org.git;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GetBookings {

    @Test
    private void GetRequestForOneBooking(){
        RestAssured.
                given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking/1").
                when().get().
                then().log().all().statusCode(200);
    }

    @Test
    private void getRequestForAllBookings(){
        RestAssured.
                given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking").
                when().get().
                then().log().all().statusCode(200);
    }
}
