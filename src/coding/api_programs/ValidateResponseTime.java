package coding.api_programs;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class ValidateResponseTime {
    public static void main(String[] args) {
        given()
            .when()
            .get("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .time(lessThan(2000L));
    }
}
