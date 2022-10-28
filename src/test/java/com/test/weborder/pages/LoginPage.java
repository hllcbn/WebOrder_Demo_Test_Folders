package com.test.weborder.pages;


import com.utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Email")
    WebElement username;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(xpath = "//button[.='Sign In']")
    WebElement signInButton;

    @FindBy(xpath = "//div[contains(text(),'Sign in Failed')]")
    WebElement errorMessage;

    public void login(String username,String password){
        this.username.clear();
        this.username.sendKeys(username);
        this.password.clear();
        this.password.sendKeys(password);
        signInButton.click();
    }

    public String errorMessage(){
        return BrowserUtils.getText(errorMessage);//error message
    }

}
