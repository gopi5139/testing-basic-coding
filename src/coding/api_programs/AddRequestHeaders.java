package coding.api_programs;

import static io.restassured.RestAssured.given;

public class AddRequestHeaders {
    public static void main(String[] args) {
        given()
            .header("Accept", "application/json")
            .header("Content-Type", "application/json")
            .when()
            .get("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .statusCode(200);
    }
}
