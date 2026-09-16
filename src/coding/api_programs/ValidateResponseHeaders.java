package coding.api_programs;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ValidateResponseHeaders {
    public static void main(String[] args) {
        given()
            .when()
            .get("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .header("Content-Type", equalTo("application/json; charset=utf-8"));
    }
}
