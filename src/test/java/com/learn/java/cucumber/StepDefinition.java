package com.learn.java.cucumber;


import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    private WebDriver driver = null;
    @Given("^user navigates to url$")
    public void user_navigates_to_url() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\apps\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");



    }

    @Given("^user search for kishore$")
    public void user_search_for_kishore() throws Throwable {
        GoogleSearchPage.textbox_search(driver).sendKeys("kishore");
        try {
            Thread.sleep(3000);
        }catch(Exception e){}
    }

    @Given("^user clicks search button$")
    public void user_clicks_search_button() throws Throwable {
        GoogleSearchPage.button_search(driver).click();
        driver.close();
    }


}
