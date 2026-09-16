package coding.automation_programs;

import java.io.FileInputStream;
import java.util.Properties;

public class ReusableConfigurationReader {
    public static String getValue(String key) throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("src/test/resources/config.properties"));
        return props.getProperty(key);
    }
    public static void main(String[] args) throws Exception {
        System.out.println(getValue("browser"));
    }
}
