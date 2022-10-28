package com.test.weborder.stepdefinitions;

import com.test.weborder.pages.LoginPage;
import com.utils.DriverHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {
    WebDriver driver= DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);

    @When("User provides username {string} and password {string}")
    public void user_provides_username_and_password(String username1, String password1) {
        loginPage.login(username1,password1);
    }

    @Then("User validates the title {string} from homepage")
    public void user_validates_the_title_from_homepage(String title) {
        Assert.assertEquals(title,driver.getTitle().trim());
        //  driver.quit();

    }
    @Then("User validates the message {string} from login page")
    public void user_validates_the_message_from_login_page(String errorMessage) {
        Assert.assertEquals(errorMessage,loginPage.errorMessage());
    }

//    @Given("User navigates to the {string}")
//    public void user_navigates_to_the(String website) {
//        driver.get(website);
//    }

    @Then("User exits the website")
    public void user_exits_the_website() {

    }
}

