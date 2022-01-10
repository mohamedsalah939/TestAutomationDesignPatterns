package org.salahlibrary.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.salahlibrary.AbstractComponents.AbstractComponent;
import org.salahlibrary.AbstractComponents.SearchFlightAvailStrategy;

import java.util.HashMap;
import java.util.function.Consumer;

public class RoundTrip extends AbstractComponent implements SearchFlightAvailStrategy {

    private By rdo = By.id("ctl00_mainContent_rbtnl_Trip_1");
    private By from = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
    private By to = By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
    private By cb = By.id("ctl00_mainContent_chk_IndArm");
    private By search = By.id("ctl00_mainContent_btn_FindFlights");

    public RoundTrip(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    @Override
    public void checkAvailability(HashMap<String, String> reservationDestinations) {

        makeStateReady(s -> findElement(from).click());
        selectOriginCity(reservationDestinations.get("origin"));
        selectDestinationCity(reservationDestinations.get("destination"));
        findElement(cb).click();
        findElement(search).click();
    }

    public void selectOriginCity(String origin) {
        findElement(from).click();
        findElement(By.xpath("//a[@value='" + origin + "']")).click();
    }

    public void selectDestinationCity(String destination) {
        findElement(to).click();
        findElement(By.xpath("(//a[@value='" + destination + "'])[2]")).click();
    }

    public void makeStateReady(Consumer<RoundTrip> consumer) {
        //prerequiste code before the test case
        findElement(rdo).click();
        consumer.accept(this);
    }
}
