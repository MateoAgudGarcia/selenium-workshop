package workshop.selenium.java.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageGoogle {

    private final WebDriver DRIVER_USED;

    private final By GOOGLE_LOGO = By.cssSelector("img.lnXdpd");
    private final By GMAIL = By.cssSelector(":nth-child(1) > .gb_g");
    private final By GOOGLE_IMAGES = By.cssSelector("nth-child(2) > .gb_g");
    private final By SEARCH_BAR = By.cssSelector("input.gLFyf.gsfi");
    private final By SEARCH_BTN = By.cssSelector("input.gNO89b");
    private final By FEEL_LUCKY = By.cssSelector("input.RNmpXc");
    private final By GOOGLE_APPS = By.cssSelector("svg.gb_We");
    private final By LOG_IN = By.cssSelector("a.gb_4.gb_5.gb_ae.gb_4c");
    private final By COUNTRY = By.cssSelector("div.uU7dJb");


    public MainPageGoogle(WebDriver DRIVER_USED) {
        this.DRIVER_USED = DRIVER_USED;
    }

    public void clickLogo(){
        DRIVER_USED.findElement(GOOGLE_LOGO).click();
    }

    public void enterGmail(){
        DRIVER_USED.findElement(GMAIL).click();
    }

    public void enterImages(){
        DRIVER_USED.findElement(GOOGLE_IMAGES).click();
    }

    public void searchGoogle(String query){
        DRIVER_USED.findElement(SEARCH_BAR).clear();
        DRIVER_USED.findElement(SEARCH_BAR).sendKeys(query);
    }

    public void clkSearch(){
        DRIVER_USED.findElement(SEARCH_BTN).submit();
    }

    public void clkFeelLucky(){
        DRIVER_USED.findElement(FEEL_LUCKY).click();
    }

    public void googleApps(){
        DRIVER_USED.findElement(GOOGLE_APPS).click();
    }

    public void logInGoogle(){
        DRIVER_USED.findElement(LOG_IN).click();
    }

    public String countryGoogle(){
        return DRIVER_USED.findElement(COUNTRY).getText();
    }
}
