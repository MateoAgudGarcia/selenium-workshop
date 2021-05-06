package workshop.selenium.java.settings;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebSite extends BaseSetUp{

    public WebSite() {}

    public static void setWindowAndGo(WebDriver driverSel, String URL) throws InterruptedException {
        driverSel.manage().window().maximize();
        driverSel.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
        driverSel.get(URL);
    }

    public String errMsg(){
        return "ERROR\tTest failed\n";
    }
}
