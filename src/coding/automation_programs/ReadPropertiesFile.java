package coding.automation_programs;

import java.util.Properties;
import java.io.FileInputStream;

public class ReadPropertiesFile {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("src/test/resources/config.properties"));
        System.out.println(props.getProperty("browser"));
    }
}
