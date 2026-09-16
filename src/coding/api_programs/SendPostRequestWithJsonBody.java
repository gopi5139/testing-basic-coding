package coding.api_programs;

import static io.restassured.RestAssured.given;

public class SendPostRequestWithJsonBody {
    public static void main(String[] args) {
        String requestBody = "{\"title\":\"Automation\",\"body\":\"Java API Sample\",\"userId\":1}";

        given()
            .contentType("application/json")
            .body(requestBody)
            .when()
            .post("https://jsonplaceholder.typicode.com/posts")
            .then()
            .statusCode(201);
    }
}
