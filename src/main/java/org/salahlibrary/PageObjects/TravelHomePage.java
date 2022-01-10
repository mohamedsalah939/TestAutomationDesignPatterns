package org.salahlibrary.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.salahlibrary.AbstractComponents.SearchFlightAvailStrategy;
import org.salahlibrary.AbstractComponents.StrategyFactory;
import org.salahlibrary.PageComponents.FooterBar;
import org.salahlibrary.PageComponents.MultiTrip;
import org.salahlibrary.PageComponents.NavigationBar;

import java.util.HashMap;

public class TravelHomePage {

    By sectionElement = By.id("traveller-home");
    By navSectionElement = By.id("buttons");
    WebDriver driver;
    SearchFlightAvailStrategy searchFlightAvail;

    public TravelHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
    }

    public NavigationBar getNavigationBar() {
        return new NavigationBar(driver, navSectionElement);
    }

    public FooterBar getFooterBar() {
        return new FooterBar(driver, sectionElement);
    }

    public void setBookingStrategy(String tripType) {
        StrategyFactory strategyFactor = new StrategyFactory(driver);
        searchFlightAvail = strategyFactor.createStrategy(tripType);

        this.searchFlightAvail = searchFlightAvail;
    }

    public void checkAvail(HashMap<String, String> reservationDestinations) {
        searchFlightAvail.checkAvailability(reservationDestinations);
    }
}
