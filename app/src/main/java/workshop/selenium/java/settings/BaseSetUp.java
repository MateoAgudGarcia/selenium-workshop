package workshop.selenium.java.settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import workshop.selenium.java.pom.MainPageGoogle;

public class BaseSetUp {
    public BaseSetUp() {}

    public static WebDriver browser(int brow, boolean head){
        WebDriver driv = null;

        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.operadriver().setup();
        WebDriverManager.edgedriver().setup();

        switch (brow){
            case 1:
                if(head){
                    driv = new ChromeDriver();
                }else{
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");
                    driv = new ChromeDriver(options);
                }
                break;
            case 2:
                driv = new FirefoxDriver();
                break;
            case 3:
                driv = new OperaDriver();
                break;
            case 4:
                driv = new EdgeDriver();
                break;
            default:
                System.out.println("Datos ingresados erroneos");
        }
        return driv;
    }
    public static String browSelec(int brow, boolean head){
        String brSel = "Browser selected : ";
        String erSel = "Datos ingresados erroneos";
        String res = "";

        boolean errS;

        switch (brow){
            case 1:
            case 2:
            case 3:
            case 4:
                errS = false;
                break;
            default:
                errS = true;
        }
        switch (brow){
            case 1:
                if(head){
                    brSel = brSel+"Google Chrome";
                }else{
                    brSel = brSel+"Google Chrome - HEADLESS";
                }
                break;
            case 2:
                brSel = brSel+"Firefox";
                break;
            case 3:
                brSel = brSel+"Opera";
                break;
            case 4:
                brSel = brSel+"Microsoft Edge";
                break;
            default:
                brSel = "";
        }
        if (!errS){
            res = brSel;
        } else{
            res = erSel;
        }
        return res;
    }


}
