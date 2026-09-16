package coding.api_programs;

import static io.restassured.RestAssured.given;

public class CompareExpectedJsonWithActualJson {
    public static void main(String[] args) {
        String actualJson = given()
            .when()
            .get("https://jsonplaceholder.typicode.com/posts/1")
            .asString();

        boolean expectedFieldsPresent = actualJson.contains("\"userId\":1")
                && actualJson.contains("\"id\":1");

        System.out.println("All expected fields present: " + expectedFieldsPresent);
    }
}
