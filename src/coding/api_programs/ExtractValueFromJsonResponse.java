package coding.api_programs;

import static io.restassured.RestAssured.given;

public class ExtractValueFromJsonResponse {
    public static void main(String[] args) {
        String title = given()
            .when()
            .get("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .extract()
            .path("title");

        System.out.println("Extracted title: " + title);
    }
}
