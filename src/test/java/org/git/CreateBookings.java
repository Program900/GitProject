package org.git;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class CreateBookings {

    @Test
    private void postRequestTest(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking")
                .body("{\n" +
                        "    \"firstname\" : \"DD\",\n" +
                        "    \"lastname\" : \"BroDSwn\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}").contentType(ContentType.JSON).post().then().log().all();



    }
    @Test
    private void extractPostRequest(){
       String Resposne= RestAssured.given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking")
                .body("{\n" +
                        "    \"firstname\" : \"DD\",\n" +
                        "    \"lastname\" : \"BroDSwn\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}").contentType(ContentType.JSON).post().then().extract().body().asPrettyString();

System.out.println("resposne"+Resposne);

    }



}
