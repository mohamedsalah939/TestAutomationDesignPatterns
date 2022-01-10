package org.salahlibrary.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class AbstractComponent {

    WebElement sectionElement;
    WebDriver driver;

    public AbstractComponent(WebDriver driver, By sectionElement) {

        this.sectionElement = driver.findElement(sectionElement);
        this.driver = driver;
    }

    public WebElement findElement(By findElementBy) {
        return sectionElement.findElement(findElementBy);
    }

    public List<WebElement> findElements(By findElementBy) {
        return sectionElement.findElements(findElementBy);
    }

    public void waitForElementToDisappear(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
    }

    public void click(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}
