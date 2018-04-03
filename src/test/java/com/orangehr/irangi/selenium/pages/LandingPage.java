package com.orangehr.irangi.selenium.pages;

import com.orangehr.irangi.selenium.util.TestBase;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.IdentityHashMap;

public class LandingPage extends TestBase {
    //elements
   @FindBy(id = "welcome")
   private  WebElement lnkWelcome;

   @FindBy(id="menu_pim_viewPimModule")
   private  WebElement lnkEmployee;

    @FindBy(id="menu_pim_addEmployee")
    private  WebElement lnkAddEmployee;


    //methods
    public String getWellComeMessage() {
        return lnkWelcome.getText();
    }

    public void logOut(){

    }

    public void clickPimMenue(){
        lnkEmployee.click();
    }

    public void clickAddEmployee(){
        lnkAddEmployee.click();
    }
}
