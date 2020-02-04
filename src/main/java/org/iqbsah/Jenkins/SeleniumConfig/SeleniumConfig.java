package org.iqbsah.Jenkins.SeleniumConfig;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {

    private WebDriver webDriver;

    private SeleniumPropertiesReader seleniumPropertiesReader = new SeleniumPropertiesReader();

    public SeleniumConfig(String browserName)
    {
        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",seleniumPropertiesReader.getChromeDriverPath());
            this.webDriver = new ChromeDriver();
        }
        this.webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.webDriver.manage().window().setSize(new Dimension(400,650));

    }
    public WebDriver getDriver() {
        return webDriver;
    }

}
