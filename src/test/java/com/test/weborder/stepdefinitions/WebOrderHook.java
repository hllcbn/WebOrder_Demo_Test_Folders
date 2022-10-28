package com.test.weborder.stepdefinitions;

import com.utils.BrowserUtils;
import com.utils.ConfigReader;
import com.utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class WebOrderHook {

    WebDriver driver= DriverHelper.getDriver();

    @Before
    public void navigation(){
        driver.get(ConfigReader.readProperty("weborderurl"));
    }

    @After
    public void tearDown(Scenario scenario){
        BrowserUtils.getScreenShotCucumber(scenario,driver);
        driver.quit();
    }
}

