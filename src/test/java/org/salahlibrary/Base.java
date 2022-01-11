package org.salahlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public WebDriver initialize() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//java//org//salahlibrary//Resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
