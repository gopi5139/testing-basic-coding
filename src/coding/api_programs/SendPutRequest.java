package coding.api_programs;

import static io.restassured.RestAssured.given;

public class SendPutRequest {
    public static void main(String[] args) {
        String requestBody = "{\"title\":\"Updated Title\"}";

        given()
            .contentType("application/json")
            .body(requestBody)
            .when()
            .put("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .statusCode(200);
    }
}
