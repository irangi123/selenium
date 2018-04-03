package com.orangehr.irangi.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class LoginPage {

    //***Define the Elements

    //Username element
    @FindBy(xpath = "//*[@id=\"txtUsername\"]")
    private WebElement txtUsername;

    //Password element
    @FindBy(id = "txtPassword")
    private WebElement txtPassword;

    //Login button
    @FindBy(css = ".button")
    private WebElement btnLogin;

    @FindBy(linkText = "OrangeHRM, Inc")
    private WebElement lnkOrangeHRM;

    @FindBy(id = "spanMessage")
    private WebElement errMessage;

    //text
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/font")
    private WebElement txtUserPass;

    //*** Interactions (methods)
    //Clear username field
    public  void clearUsername(){
        txtUsername.clear();
    }

    //Type username
    public void typeUsername(String username){
        txtUsername.sendKeys(username);
    }

    public void clearAndTypeUsername(String username){
        clearUsername();
        typeUsername(username);
    }

    //Clear password field
    public void clearPasswordname(){
        txtPassword.clear();
    }


    //Type password
    public  void typePassowrd(String password){
        txtPassword.sendKeys(password);
    }


    //Click login button
    public void clickloginButton(){
        btnLogin.click();
    }

    //submit login form
    public  void submitLoginForm(){
        txtPassword.submit();
    }

    //Error messages
    public String getErrorMessage(){
        return errMessage.getText();
    }

    //link
    public String getOrangeURL(){
        //lnkOrangeHRM.click();
        return lnkOrangeHRM.getAttribute("href");

    }


    //Get Text
    public String getText(){
        return txtUserPass.getText();
    }

    public void clickLoginImage(){
        Screen screen = new Screen();
        try {
            screen.click("screenshots/Loginbutton.PNG");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

    }

    public void clickOrangeURL() {
        lnkOrangeHRM.click();
    }
}
