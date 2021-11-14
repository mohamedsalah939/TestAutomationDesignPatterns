package org.salahlibrary.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.salahlibrary.PageComponents.FooterBar;
import org.salahlibrary.PageComponents.NavigationBar;

public class TravelHomePage {

    By sectionElement = By.id("traveller-home");
    By navSectionElement = By.id("buttons");
    WebDriver driver;

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


}
