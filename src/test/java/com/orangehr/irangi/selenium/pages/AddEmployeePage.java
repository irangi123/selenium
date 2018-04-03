package com.orangehr.irangi.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage {

    @FindBy(id ="firstName")
    private WebElement txtFirstName ;
    @FindBy(id ="lastName")
    private WebElement txtLastName ;
    @FindBy(id ="photofile")
    private WebElement btnChooseFile ;
    @FindBy(id ="btnSave")
    private WebElement btnSave ;

    public void typeFirstName(String firstname){
        txtFirstName.sendKeys(firstname);
    }

    public void typeLastName(String lastname){
        txtLastName.sendKeys(lastname);
    }


    public void uploadFile(String filename){
        btnChooseFile.sendKeys(filename);
    }

    public void clickSave(){
        btnSave.click();
    }

}
