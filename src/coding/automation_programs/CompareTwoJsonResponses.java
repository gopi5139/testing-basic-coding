package coding.automation_programs;

import org.json.JSONObject;

public class CompareTwoJsonResponses {
    public static void main(String[] args) {
        JSONObject first = new JSONObject("{\"id\":1,\"name\":\"Alice\"}");
        JSONObject second = new JSONObject("{\"id\":1,\"name\":\"Alice\"}");
        System.out.println(first.similar(second));
    }
}
