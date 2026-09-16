package coding.api_programs;

import static io.restassured.RestAssured.given;

public class AddPathParameters {
    public static void main(String[] args) {
        given()
            .pathParam("id", 1)
            .when()
            .get("https://jsonplaceholder.typicode.com/posts/{id}")
            .then()
            .statusCode(200);
    }
}
