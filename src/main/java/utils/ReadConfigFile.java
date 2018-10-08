package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
    protected InputStream input = null;
    protected Properties prop = null;

    public ReadConfigFile() {
        try {
            // input = ReadConfigFile.class.getClassLoader().getResourceAsStream(Constant.CONFIG_PROPERTIES_DIRECTORY);
            input = ReadConfigFile.class.getClassLoader().getResourceAsStream("E:\\IntelijIdea\\checkUdemy3\\src\\main\\java\\properties\\config.properties");
            prop = new Properties();
            prop.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        if (prop.getProperty("browser") == null)
            return "";
        return prop.getProperty("browser");

    }
}