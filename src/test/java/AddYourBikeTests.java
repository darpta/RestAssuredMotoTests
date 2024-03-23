import config.MotoConfig;
import config.MotoData;
import config.MotoEndpoints;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AddYourBikeTests extends MotoConfig {


    @Test
    public void addYourBike() {

        given()
                .body(MotoData.ADD_BIKE_BODY)
        .when()
                .post(MotoEndpoints.ADD_YOUR_BIKE)
        .then();
    }
}
