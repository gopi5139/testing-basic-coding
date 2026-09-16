package coding.api_programs;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ReusableApiRequestUtility {
    public static Response get(String url) {
        return given().when().get(url);
    }

    public static void main(String[] args) {
        Response response = get("https://jsonplaceholder.typicode.com/posts/1");
        System.out.println("Status code: " + response.getStatusCode());
    }
}
