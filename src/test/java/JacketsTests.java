import config.MotoConfig;
import config.MotoEndpoints;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class JacketsTests extends MotoConfig{

    @Test
    public void getAllInfo() {
        given()
                .log().all()
                .when()
        .get(MotoEndpoints.JACKETS)
                .then()
        .log().all();
    }
}
