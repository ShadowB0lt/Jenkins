package org.iqbsah.Jenkins;

import static org.junit.Assert.assertTrue;

import org.iqbsah.Jenkins.BBCDomain.BBCDomain;
import org.iqbsah.Jenkins.SeleniumConfig.SeleniumConfig;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private BBCDomain bbcDomain = new BBCDomain(new SeleniumConfig("chrome").getDriver());
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void goToHomePage()
    {
        bbcDomain.HomePage().goToHomePage();
        Assert.assertEquals("https://www.bbc.co.uk/",bbcDomain.HomePage().getWebDriver().getCurrentUrl());
        bbcDomain.quitDriver();
    }

    @Test
    public void goToLoginPage()
    {
        bbcDomain.HomePage().goToHomePage().clickSignInLink();
        bbcDomain.quitDriver();
    }

}
