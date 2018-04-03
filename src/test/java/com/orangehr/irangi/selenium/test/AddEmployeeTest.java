package com.orangehr.irangi.selenium.test;

import com.orangehr.irangi.selenium.pages.AddEmployeePage;
import com.orangehr.irangi.selenium.pages.LandingPage;
import com.orangehr.irangi.selenium.pages.LoginPage;
import com.orangehr.irangi.selenium.util.Constants;
import com.orangehr.irangi.selenium.util.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddEmployeeTest extends TestBase {

    //Validate ImageUpload and create a profile
    @Test
    public void uploadFile(){
        webDriver.get(Constants.BASE_URL);
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.typeUsername(Constants.USER_NAME);
        loginPage.typePassowrd(Constants.USER_PASSWORD);
        loginPage.clickLoginImage();
        LandingPage landingPage = PageFactory.initElements(webDriver, LandingPage.class);
        String welcomeMessage = landingPage.getWellComeMessage();
        landingPage.clickPimMenue();
        landingPage.clickAddEmployee();
        AddEmployeePage addEmployeePage = PageFactory.initElements(webDriver,AddEmployeePage.class);
        addEmployeePage.typeFirstName(Constants.EMPLOYEE_FIRST_NAME);
        addEmployeePage.typeLastName(Constants.EMPLOYEE_LAST_NAME);
        addEmployeePage.uploadFile(Constants.IMAGE_PATH);
        addEmployeePage.clickSave();



    }

}
