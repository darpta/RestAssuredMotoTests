import config.MotoConfig;
import config.MotoEndpoints;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PromotionsTests extends MotoConfig {

    @Test
    public void getAllInfo() {
        given().queryParam("offset", "0")
                .queryParam("amount", "40")
                .log().all()
        .when()
                .get(MotoEndpoints.PROMOTIONS)
        .then()
                .log().all();
    }
}
