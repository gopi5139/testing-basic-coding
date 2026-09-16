package coding.automation_programs;

import org.json.JSONObject;
import org.json.JSONTokener;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJsonFileAndExtractSpecificValues {
    public static void main(String[] args) throws Exception {
        String json = Files.readString(Paths.get("src/test/resources/sample.json"));
        JSONObject obj = new JSONObject(new JSONTokener(json));
        System.out.println(obj.getString("name"));
    }
}
