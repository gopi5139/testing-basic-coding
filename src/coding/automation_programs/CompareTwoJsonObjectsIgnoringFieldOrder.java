package coding.automation_programs;

import org.json.JSONObject;

public class CompareTwoJsonObjectsIgnoringFieldOrder {
    public static void main(String[] args) {
        JSONObject first = new JSONObject("{\"name\":\"Alice\",\"id\":1}");
        JSONObject second = new JSONObject("{\"id\":1,\"name\":\"Alice\"}");
        System.out.println(first.toMap().equals(second.toMap()));
    }
}
