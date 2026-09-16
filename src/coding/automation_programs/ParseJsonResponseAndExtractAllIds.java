package coding.automation_programs;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonResponseAndExtractAllIds {
    public static void main(String[] args) {
        JSONArray arr = new JSONArray("[{\"id\":1},{\"id\":2},{\"id\":3}]");
        for (int i = 0; i < arr.length(); i++) {
            System.out.println(arr.getJSONObject(i).getInt("id"));
        }
    }
}
