package org.salahlibrary.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.salahlibrary.AbstractComponents.AbstractComponent;

public class NavigationBar extends AbstractComponent {
    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");

    public NavigationBar(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    public String getFlightsAttr() {
        return findElement(flights).getAttribute("class");
        //    click(findElement(flights));
    }

    public int getLinksCount() {
        return findElements(links).size();
    }
}
