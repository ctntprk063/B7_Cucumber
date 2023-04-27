package com.eurotech.pages;

import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage extends BasePage{
    @FindBy(name = "githubusername")
    public WebElement githubusername;

    @FindBy(linkText = "Go Back")
    public WebElement goBackBnt;

    @FindBy(id = "editprofile-from-status-select")
    public WebElement selectBox;

    @FindBy(id = "slider-input")
    public WebElement slayderInput;
    @FindBy(css = "[type='submit']")
    public WebElement editSubmitBtn;

    public void selectStatus(String value){
        Select select=new Select(selectBox);
        select.selectByValue(value);
    }

    public void slader(int experienceYear){
        for (int i = 0; i < 10; i++) {
            slayderInput.sendKeys(Keys.ARROW_LEFT);
            // BrowserUtils.waitFor(1);
        }
        for (int i = 0; i < experienceYear; i++) {
            slayderInput.sendKeys(Keys.ARROW_RIGHT);
            // BrowserUtils.waitFor(1);
        }
    }

    public void addInfo(String inputBox,String info){
        WebElement placeHolder = Driver.get().findElement(By.name(inputBox));
        //WebElement placeHolder = Driver.get().findElement(By.xpath("//input[@placeholder='"+inputBox+"']"));
        placeHolder.clear();
        //BrowserUtils.waitFor(1);
        placeHolder.sendKeys(info);
        BrowserUtils.waitFor(1);
    }


}
