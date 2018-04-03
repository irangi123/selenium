package com.orangehr.irangi.selenium.test;

import com.orangehr.irangi.selenium.pages.LandingPage;
import com.orangehr.irangi.selenium.pages.LoginPage;
import com.orangehr.irangi.selenium.pages.OrangeHRMPage;
import com.orangehr.irangi.selenium.util.Constants;
import com.orangehr.irangi.selenium.util.TestBase;
import javafx.stage.Screen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {
    //Blank Username
    @Test (priority = 1)
    public void testLoginwithBlankUsername(){
        //create a login page and Initialize elements
        webDriver.get(Constants.BASE_URL);
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.clearUsername();
        loginPage.typePassowrd(Constants.USER_PASSWORD);
        loginPage.submitLoginForm();

        Assert.assertEquals(loginPage.getErrorMessage(),"Username cannot be empty");
        System.out.println("1.Test Login with blank username : pass");

    }

    //Blank Password
    @Test (priority = 2)
    public void testLoginwithBlankPassword(){
        webDriver.get(Constants.BASE_URL);
        LoginPage loginPage =PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.typeUsername(Constants.USER_NAME);
        loginPage.clearPasswordname();
        loginPage.submitLoginForm();

        Assert.assertEquals(loginPage.getErrorMessage(), "Password cannot be empty");
        System.out.println("2. Test with Blank Password : Pass");
    }

    //blank username and password
    @Test (priority = 3)
    public void testLoginwithEmptyUsernamePassword(){
        webDriver.get(Constants.BASE_URL);
        LoginPage loginPage =PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.clearUsername();
        loginPage.clearPasswordname();
        loginPage.submitLoginForm();
        Assert.assertEquals(loginPage.getErrorMessage(), "Username cannot be empty");
        System.out.println("3. Test with empty username /password : pass");
    }

    @Test (priority = 7)
    //Validate the link
    public void testLinkofURL(){
        webDriver.get(Constants.BASE_URL);
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.clickOrangeURL();
        OrangeHRMPage orangeHRMPage = PageFactory.initElements(webDriver,OrangeHRMPage.class );
        Assert.assertEquals(orangeHRMPage.getURL(),"https://www.orangehrm.com/");
        System.out.println("Test the Link : pass");
        webDriver.close();

    }

    //Validate the text
    @Test (priority = 4)
    public void testContent(){
        webDriver.get(Constants.BASE_URL);
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        String content = loginPage.getText();
        Assert.assertEquals(loginPage.getText(),"( Username : Admin | Password : admin )");
        System.out.println("Content text" + content + "Test Pass");
    }

    //Valid Credentials
    @Test (priority = 5)
    public void testLoginWithValidCredentials(){
        webDriver.get(Constants.BASE_URL);

        //Create a login page and Initialize the element
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.typeUsername(Constants.USER_NAME);
        loginPage.typePassowrd(Constants.USER_PASSWORD);
        loginPage.submitLoginForm();

        //Create landing page and Initialize the elements
        LandingPage landingPage = PageFactory.initElements(webDriver, LandingPage.class);
        String welcomeMessage = landingPage.getWellComeMessage();
        Assert.assertEquals(welcomeMessage , "Welcome Admin");
        System.out.println("3.Test Login with valid credentails : Pass");
        webDriver.navigate().back();


    }

    @Test (priority = 6)
    public void testLoginButton(){
        webDriver.get(Constants.BASE_URL);

        //Create a login page and Initialize the element
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.typeUsername(Constants.USER_NAME);
        loginPage.typePassowrd(Constants.USER_PASSWORD);
        loginPage.clickLoginImage();

        //Create landing page and Initialize the elements
        LandingPage landingPage = PageFactory.initElements(webDriver, LandingPage.class);
        String welcomeMessage = landingPage.getWellComeMessage();
        Assert.assertEquals(welcomeMessage ,"Welcome Admin" );
        System.out.println("3.Test Login with valid credentails : Pass");
        webDriver.navigate().back();
    }



}
