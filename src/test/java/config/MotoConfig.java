package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.BeforeClass;

public class MotoConfig {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "https://www.24mx.ie/INTERSHOP/rest/WFS/Pierce-24mx-Site/24mx-ie";

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType("application/json")
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }
}
