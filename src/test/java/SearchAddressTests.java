import config.MotoConfig;
import config.MotoData;
import config.MotoEndpoints;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SearchAddressTests extends MotoConfig {

    @Test
    public void searchAddress() {

        given()
                .header("Authorization", "Bearer Y2xpZW50dHdvOjhhOTNiODZlYjIyNjQyNjU4YjExNzE1NDYwNmNkNjA0")
                .body(MotoData.SEARCH_ADDRESS_BODY)
        .when()
                .patch(MotoEndpoints.SEARCH_ADDRESS)
        .then();
    }
}
