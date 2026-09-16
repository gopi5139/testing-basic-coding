package coding.api_programs;

import static io.restassured.RestAssured.given;

public class ValidateHttpStatusCode {
    public static void main(String[] args) {
        given()
            .when()
            .get("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .statusCode(200);
    }
}
