package org.iqbsah.Jenkins.SeleniumConfig;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SeleniumPropertiesReader {

    private String chromeDriverPath;
    private String seleniumPropertiesFilePath = "resources/selenium.properties";

    public SeleniumPropertiesReader()
    {
        Properties properties = new Properties();
        try
        {
          properties.load(new FileReader(seleniumPropertiesFilePath));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        chromeDriverPath = properties.getProperty("chromedriverpath");
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }
}
