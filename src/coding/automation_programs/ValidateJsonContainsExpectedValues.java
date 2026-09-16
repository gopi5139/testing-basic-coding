package coding.automation_programs;

import org.json.JSONObject;

public class ValidateJsonContainsExpectedValues {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject("{\"status\":\"success\",\"id\":101}");
        System.out.println(obj.getString("status").equals("success") && obj.getInt("id") == 101);
    }
}
