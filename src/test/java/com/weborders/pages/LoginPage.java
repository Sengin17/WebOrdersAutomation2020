package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage{

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userName;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;

    // login() ---> for valid credential automatically
    public void login(){

        String usernameValue = ConfigurationReader.getProperty( "username" );
        String passwordValue = ConfigurationReader.getProperty( "password" );

        userName.sendKeys( usernameValue );
        password.sendKeys( passwordValue, Keys.ENTER );

    }

    // this is overloading
    // you give invalid credentials to get error
    // if user wants to specify different username and password
    //for example if you need to enter wrong username and password for negative testing
    public void login(String usernameValue, String passwordValue  ){

        userName.sendKeys( usernameValue );
        password.sendKeys( passwordValue, Keys.ENTER );

    }
}
