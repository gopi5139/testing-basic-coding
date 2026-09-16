package coding.api_programs;

import static io.restassured.RestAssured.given;

public class AddQueryParameters {
    public static void main(String[] args) {
        given()
            .queryParam("userId", 1)
            .when()
            .get("https://jsonplaceholder.typicode.com/posts")
            .then()
            .statusCode(200);
    }
}
