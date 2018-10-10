package utils;

import java.io.*;
import java.util.Properties;

public class ReadConfigFile {
    protected InputStream input = null;
    protected Properties prop = null;

    public ReadConfigFile(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(Constant.CONFIG_PROPERTIES_DIRECTORY));
            prop = new Properties();
            try {
                prop.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + Constant.CONFIG_PROPERTIES_DIRECTORY);
        }
    }

    public String getBrowser() {
        if (prop.getProperty("browser") == null)
            return "";
        return prop.getProperty("browser");

    }
}