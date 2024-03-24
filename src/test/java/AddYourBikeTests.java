import config.MotoConfig;
import config.MotoData;
import config.MotoEndpoints;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class AddYourBikeTests extends MotoConfig {


    @Test
    public void addYourBike() {

        given()
                .body(MotoData.ADD_BIKE_BODY)
        .when()
                .post(MotoEndpoints.ADD_YOUR_BIKE)
        .then()
                .header("Connection", "keep-alive")
                .header("Content-Encoding", "gzip")
                .contentType(ContentType.JSON)
                .body("replyText", equalTo("OK"));
    }

}
