import config.MotoConfig;
import config.MotoEndpoints;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class LeattMudcoatBlackTests extends MotoConfig {

    @Test
    public void getAllInfo() {
        given()
                .log().all()
        .when()
                .get(MotoEndpoints.LEATT_MUDCOAT_BLACK)
        .then()
                .log().all();
    }
}
