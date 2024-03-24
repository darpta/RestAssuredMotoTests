import config.MotoConfig;
import config.MotoEndpoints;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PromotionsTests extends MotoConfig {

    // 1 version
    @Test
    public void getPromotionsInfo() {
        given()
                .queryParam("offset", "0")
                .queryParam("amount", "40")
        .when()
                .get(MotoEndpoints.PROMOTIONS)
        .then()
                .contentType(ContentType.JSON)
                .body("description", equalTo("Outlet IE"))
                .body("name", equalTo("products"));
    }

    // 2 version
    @Test
    public void getPromotionsInfWithAssert() {

        Response response = given().queryParam("offset", "0")
                .queryParam("amount", "40")
                .when()
                .get(MotoEndpoints.PROMOTIONS);
        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.body().jsonPath().getString("elements.type[0]"), "Link");
        Assert.assertEquals(response.body().jsonPath().getString("sortingList.sortingAttributes.displayName[0]"), "Popular");
        Assert.assertEquals(response.body().jsonPath().getString("sortingList.type"), "CC_SortingListRO");
        response.prettyPrint();
    }
}
