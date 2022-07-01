package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class verify {

    public static void VerifyTitle(WebDriver drv,String actualResult){
        String expectedResult = propertiesReader.getProperty("logInPageTitle");
        Assert.assertEquals(expectedResult,actualResult);
    }



}
