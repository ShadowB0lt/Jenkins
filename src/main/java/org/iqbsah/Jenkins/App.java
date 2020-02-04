package org.iqbsah.Jenkins;

import org.iqbsah.Jenkins.BBCDomain.BBCDomain;
import org.iqbsah.Jenkins.SeleniumConfig.SeleniumConfig;
import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BBCDomain bbcDomain = new BBCDomain(new SeleniumConfig("chrome").getDriver());
        bbcDomain.HomePage().goToHomePage().clickSignInLink();


    }
}
