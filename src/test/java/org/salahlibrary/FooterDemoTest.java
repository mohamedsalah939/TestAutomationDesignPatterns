package org.salahlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.salahlibrary.PageComponents.MultiTrip;
import org.salahlibrary.PageComponents.RoundTrip;
import org.salahlibrary.PageObjects.TravelHomePage;
import org.salahlibrary.testData.jsonReader;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FooterDemoTest extends Base {
    WebDriver driver;
    TravelHomePage travelHome;

    @BeforeTest
    public void setup() {
        driver = initialize();
        travelHome = new TravelHomePage(driver);
    }

    @Test(dataProvider = "getData")
    public void flightTest(HashMap<String, String> reservationDestinations) {


        travelHome.goTo();
        System.out.println(travelHome.getFooterBar().getFlightsAttr());
        System.out.println(travelHome.getFooterBar().getLinksCount());
        System.out.println(travelHome.getNavigationBar().getFlightsAttr());
        System.out.println(travelHome.getNavigationBar().getLinksCount());


        travelHome.setBookingStrategy("multiTrip");
        travelHome.checkAvail(reservationDestinations);
    }

    @DataProvider
    public Object[][] getData() throws IOException {


        List<HashMap<String, String>> dataList = new ArrayList();
       jsonReader jr = new jsonReader();
        dataList =  jr.getJsonData(System.getProperty("user.dir") + "//src//main//java//org//salahlibrary//testData//reservationTestData.json");
        return new Object[][]{
                {dataList.get(0)},{dataList.get(1)}
        };
    }
}
