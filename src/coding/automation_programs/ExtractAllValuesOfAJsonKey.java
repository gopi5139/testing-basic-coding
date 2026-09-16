package coding.automation_programs;

import org.json.JSONArray;
import org.json.JSONObject;

public class ExtractAllValuesOfAJsonKey {
    public static void main(String[] args) {
        JSONArray arr = new JSONArray("[{\"name\":\"Alice\"},{\"name\":\"Bob\"}]");
        for (int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            System.out.println(obj.getString("name"));
        }
    }
}
