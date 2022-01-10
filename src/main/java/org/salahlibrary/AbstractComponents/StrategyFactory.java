package org.salahlibrary.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.salahlibrary.PageComponents.MultiTrip;
import org.salahlibrary.PageComponents.RoundTrip;

public class StrategyFactory {
    WebDriver driver;
    By sectionElement = By.id("flightSearchContainer");

    public StrategyFactory(WebDriver driver) {
        this.driver = driver;
    }

    public SearchFlightAvailStrategy createStrategy(String tripType) {
        if (tripType.equalsIgnoreCase("multiTrip")) {
            return new MultiTrip(driver, sectionElement);
        }
        if (tripType.equalsIgnoreCase("roundTrip")) {
            return new RoundTrip(driver, sectionElement);
        }
        return null;
    }
}
