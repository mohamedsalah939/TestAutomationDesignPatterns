package org.salahlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.salahlibrary.PageComponents.MultiTrip;
import org.salahlibrary.PageComponents.RoundTrip;
import org.salahlibrary.PageObjects.TravelHomePage;
import org.testng.annotations.Test;

public class FooterDemoTest {
    By sectionElement = By.id("flightSearchContainer");
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

        travelHome.setBookingStrategy(new RoundTrip(driver,sectionElement));
        travelHome.checkAvail("MAA","HYD");
    }
}
