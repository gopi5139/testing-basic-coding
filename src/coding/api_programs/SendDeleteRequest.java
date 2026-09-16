package coding.api_programs;

import static io.restassured.RestAssured.given;

public class SendDeleteRequest {
    public static void main(String[] args) {
        given()
            .when()
            .delete("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .statusCode(200);
    }
}
