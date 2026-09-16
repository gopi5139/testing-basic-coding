package coding.automation_programs;

import org.json.JSONObject;

public class FindExtraFieldsBetweenJsonResponses {
    public static void main(String[] args) {
        JSONObject actual = new JSONObject("{\"id\":1,\"name\":\"Alice\",\"role\":\"admin\"}");
        JSONObject expected = new JSONObject("{\"id\":1,\"name\":\"Alice\"}");
        actual.keySet().stream().filter(k -> !expected.has(k)).forEach(System.out::println);
    }
}
