package org.iqbsah.Jenkins.BBCDomain;

import org.iqbsah.Jenkins.BBCDomain.BBCPageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class BBCDomain {

    private final WebDriver driver;


    public BBCDomain(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage HomePage()
    {
        return new HomePage(driver);
    }
    public void quitDriver()
    {
        this.driver.quit();
    }


}
