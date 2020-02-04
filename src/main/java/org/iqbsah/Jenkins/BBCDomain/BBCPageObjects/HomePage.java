package org.iqbsah.Jenkins.BBCDomain.BBCPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver webDriver;

    private String homePageURL = "https://www.bbc.co.uk/";

    private final By signInLink = By.id("idcta-link");

    public HomePage (WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public HomePage goToHomePage()
    {
        webDriver.navigate().to(homePageURL);

        return this;
    }

    public HomePage clickSignInLink()
    {
        webDriver.findElement(signInLink).click();
        return this;
    }

    public WebDriver getWebDriver()
    {
        return webDriver;
    }


}
