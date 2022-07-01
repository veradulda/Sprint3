package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.propertiesReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage {

    public logInPage() {
        PageFactory.initElements(Driver.getDrv(),this);
    }

    @FindBy(id ="user")
    public static WebElement userNameInput;

    @FindBy(id = "password")
    public static WebElement passWordInput;

    @FindBy(id = "submit-form")
    public static WebElement LoginBtn;

    public static void LogInByDefaultData(){
        Driver.getDrv().get( propertiesReader.getProperty("url") );
        userNameInput.sendKeys(propertiesReader.getProperty("defaultUserName"));
        passWordInput.sendKeys(propertiesReader.getProperty("defaultPassWord"));
        LoginBtn.click();
    }




}
