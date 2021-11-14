package org.salahlibrary.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.salahlibrary.AbstractComponents.AbstractComponent;

public class FooterBar extends AbstractComponent {

    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");

    public FooterBar(WebDriver driver, By sectionElement) {
        // when you inherit parent class you should invoke parent class constructor in your child constructor
        super(driver, sectionElement);
    }
    //Method to handle flights in footer only
    //When selenium execute any method for this class, the scope should be the footer only

    public String getFlightsAttr() {
        return findElement(flights).getAttribute("class");
        //    click(findElement(flights));
    }

    public int getLinksCount() {
        return findElements(links).size();
    }
}
