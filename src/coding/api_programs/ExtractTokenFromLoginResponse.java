package coding.api_programs;

import static io.restassured.RestAssured.given;

public class ExtractTokenFromLoginResponse {
    public static void main(String[] args) {
        String token = given()
            .contentType("application/json")
            .body("{\"email\":\"eve.holt@reqres.in\",\"password\":\"cityslicka\"}")
            .when()
            .post("https://reqres.in/api/login")
            .then()
            .statusCode(200)
            .extract()
            .path("token");

        System.out.println("Token: " + token);
    }
}
