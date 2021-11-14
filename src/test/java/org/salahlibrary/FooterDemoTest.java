package org.salahlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.salahlibrary.PageObjects.TravelHomePage;
import org.testng.annotations.Test;

public class FooterDemoTest {

    @Test
    public void flightTest() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//java//org//salahlibrary//Resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        TravelHomePage travelHome = new TravelHomePage(driver);
        travelHome.goTo();
        System.out.println(travelHome.getFooterBar().getFlightsAttr());
        System.out.println(travelHome.getFooterBar().getLinksCount());
        System.out.println(travelHome.getNavigationBar().getFlightsAttr());
        System.out.println(travelHome.getNavigationBar().getLinksCount());
    }
}
