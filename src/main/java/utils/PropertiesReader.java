package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    private static final Properties properties = new Properties();

    static {
        load("DemoAppConfiguration.properties");
        load("DemoAppXpathUtils.properties");
    }

    private static void load(String fileName) {
        try (InputStream input = PropertiesReader.class.getClassLoader()
                                        .getResourceAsStream(fileName)) {
            if (input == null) {
                throw new RuntimeException("❌ Cannot find properties file: " + fileName);
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("❌ Error loading properties file: " + fileName, e);
        }
    }

    public static String get(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
            throw new RuntimeException("❌ Missing property for key: " + key);
        }
        return value;
    }

}
