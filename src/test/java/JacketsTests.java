import config.MotoConfig;
import config.MotoEndpoints;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class JacketsTests extends MotoConfig{

    // 1 version
    @Test
    public void getJacketsInfo() {
        given()
        .when()
                .get(MotoEndpoints.JACKETS)
        .then()
                .contentType(ContentType.JSON)
                .body("currentCategoryDisplayName", equalTo("Jackets"))
                .body("filters.filterEntries.count[0]", hasItem(289))
                .body("rootCategoryDisplayName", equalTo("Lifestyle & Outdoor"));
    }

    // 2 version
    @Test
    public void getJacketsInfoWithAssert() {

        Response response = given()
                .when()
                .get(MotoEndpoints.JACKETS);
        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.body().jsonPath().getString("elements.title[0]"), "Leatt Mudcoat Black");
        Assert.assertEquals(response.body().jsonPath().getString("sortingList.sortingAttributes.displayName[0]"), "Popular");
        response.prettyPrint();
    }

    @Test
    public void getNamesOfAllJackets() {
        Response response = get(MotoEndpoints.JACKETS)
                .then()
                .extract().response();

        List<String> jacketNames = response.path("elements.title");

        for(String jacketName: jacketNames) {
            System.out.println(jacketName);
        }
    }

    @Test
    public void captureResponseTime() {
        long responseTime = get(MotoEndpoints.JACKETS).time();
        System.out.println("Response time in MS: " + responseTime);
    }
}
