package coding.api_programs;

import static io.restassured.RestAssured.given;

public class PassExtractedTokenToAnotherApi {
    public static void main(String[] args) {
        String token = "QpwL5tke4Pnpja7X4";

        given()
            .header("Authorization", "Bearer " + token)
            .when()
            .get("https://reqres.in/api/users/2")
            .then()
            .statusCode(200);
    }
}
