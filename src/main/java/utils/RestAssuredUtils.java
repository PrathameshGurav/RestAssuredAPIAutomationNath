package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public  class RestAssuredUtils {

    public static Response performPost(String endPoint, String requestBody, Map<String,String> headers){
        Response response= RestAssured.given()
                .baseUri(endPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post().then().log().all().extract().response();
        return response;
    }
}
