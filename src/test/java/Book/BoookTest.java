package Book;

import Utils.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RestAssuredUtils;

import java.util.HashMap;

public class BoookTest extends ExtentManager {
    public static ExtentReports extent = ExtentManager.getInstance();
    @Test
    public void createBook(){
        String endpoint="https://petstore.swagger.io/v2/pet";

        String payload="{\n" +
                "  \"id\": 8993,\n" +
                "  \"category\": {\n" +
                "    \"id\": 89,\n" +
                "    \"name\": \"Patty\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"Patty.com\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"sold\"\n" +
                "}";
        Response response=RestAssuredUtils.performPost(endpoint,payload,new HashMap<>());
        

        Assert.assertEquals(response.statusCode(),200);

        extent.createTest("Api test for creating a book")
                .info("Endpoint: "+endpoint)
                .info("Payload: "+payload)
                .pass("Status code is 200");
        extent.flush();
    }

}
