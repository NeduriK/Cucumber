package com.learn.java.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    public static WebElement textbox_search(WebDriver driver) {
        return driver.findElement(By.name("q"));
    }

    public static WebElement button_search(WebDriver driver) {
        return driver.findElement(By.name("btnK"));
    }


}
