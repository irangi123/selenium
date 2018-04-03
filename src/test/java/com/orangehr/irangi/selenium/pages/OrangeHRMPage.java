package com.orangehr.irangi.selenium.pages;

import com.orangehr.irangi.selenium.util.TestBase;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMPage extends TestBase{

    public String getURL(){
        return webDriver.getCurrentUrl();
    }
}
