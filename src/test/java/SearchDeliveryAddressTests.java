import config.MotoConfig;
import config.MotoData;
import config.MotoEndpoints;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class SearchDeliveryAddressTests extends MotoConfig {

    // 1 version
    @Test
    public void searchDeliveryAddress() {

        given()
                .header("Authorization", "Bearer Y2xpZW50dHdvOjhhOTNiODZlYjIyNjQyNjU4YjExNzE1NDYwNmNkNjA0")
                .body(MotoData.SEARCH_ADDRESS_BODY)
        .when()
                .patch(MotoEndpoints.SEARCH_ADDRESS)
        .then()
                .contentType(ContentType.JSON)
                .body("purchase_country", equalTo("IE"))
                .body("flags.show_carrier_icons", equalTo(false))
                .body("next_level_price.requirements.cart_value", equalTo(15000));
    }

    // 2 version
    @Test
    public void searchDeliveryAddressWithAssert() {

        Response response = given()
                .header("Authorization", "Bearer Y2xpZW50dHdvOjhhOTNiODZlYjIyNjQyNjU4YjExNzE1NDYwNmNkNjA0")
                .body(MotoData.SEARCH_ADDRESS_BODY)
        .when()
                .patch(MotoEndpoints.SEARCH_ADDRESS);
        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.body().jsonPath().getString("checkout_session_id"), "VM2-663a8611704c4e2e8b5d8a35a4f3d143");
        Assert.assertEquals(response.body().jsonPath().getString("search_address.postal_code"), "D04X2C2");
        Assert.assertEquals(response.body().jsonPath().getString("next_level_price.shipping_option.carrier_name"), "DHL");
        response.prettyPrint();
    }
}
