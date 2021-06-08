package workshop.selenium.java.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public interface setWait {


    default void explicitWait(By defaultBy,WebDriver DRIVER_USED){

        WebDriverWait wait = new WebDriverWait(DRIVER_USED,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.or(
                            ExpectedConditions.visibilityOfElementLocated(defaultBy),
                            ExpectedConditions.elementToBeClickable(defaultBy)));

        /*Wait<WebDriver> wait = new FluentWait<WebDriver>(DRIVER_USED)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(defaultBy);
            }
        });*/
    }
}
