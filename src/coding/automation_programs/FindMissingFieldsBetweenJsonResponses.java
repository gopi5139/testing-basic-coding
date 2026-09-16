package coding.automation_programs;

import org.json.JSONObject;

public class FindMissingFieldsBetweenJsonResponses {
    public static void main(String[] args) {
        JSONObject expected = new JSONObject("{\"id\":1,\"name\":\"Alice\",\"email\":\"a@test.com\"}");
        JSONObject actual = new JSONObject("{\"id\":1,\"name\":\"Alice\"}");
        expected.keySet().stream().filter(k -> !actual.has(k)).forEach(System.out::println);
    }
}
