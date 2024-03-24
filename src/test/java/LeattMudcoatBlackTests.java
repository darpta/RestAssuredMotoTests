import config.MotoConfig;
import config.MotoEndpoints;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class LeattMudcoatBlackTests extends MotoConfig {

    // 1 version
    @Test
    public void getProductInfo() {
        given()
        .when()
                .get(MotoEndpoints.LEATT_MUDCOAT_BLACK)
        .then()
                .contentType(ContentType.JSON)
                .body("sku", equalTo("PIA-317641"))
                .body("productName", equalTo("Leatt Mudcoat Black"))
                .body("availability", equalTo(true))
                .body("minOrderQuantity", equalTo(1));
    }

    // 2 version
    @Test
    public void getProductInfoWithParam() {
        given()
                .pathParam("productID", 317641)
        .when()
                .get(MotoEndpoints.PIA_PRODUCTS)
        .then()
                .contentType(ContentType.JSON)
                .body("sku", equalTo("PIA-317641"))
                .body("productName", equalTo("Leatt Mudcoat Black"))
                .body("availability", equalTo(true))
                .body("minOrderQuantity", equalTo(1));
    }

}
