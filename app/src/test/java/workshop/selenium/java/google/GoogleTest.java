/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package workshop.selenium.java.google;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.opentest4j.AssertionFailedError;
import workshop.selenium.java.pom.google.MainPageGoogle;
import workshop.selenium.java.settings.WebSite;
import workshop.selenium.java.store.StoreTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@Disabled
class GoogleTest extends WebSite{

    private static final int BROWSER_CHN = 1;
    private static final boolean HEAD = false;
    private static final String URL = "https://www.google.com/";

    private static final WebDriver WEB_DRIVER = browser(BROWSER_CHN,HEAD);
    private static final Logger LOGGER = Logger.getLogger(GoogleTest.class);
    private static final String DRIVER_STG = browSelec(BROWSER_CHN,HEAD);

    MainPageGoogle mainPageGoogle = new MainPageGoogle(WEB_DRIVER);

    @BeforeAll
    static void setUp(){
        try {
            PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\main\\resources\\log4j-test.properties");
            LOGGER.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+ GoogleTest.class.getName());
            LOGGER.info(DRIVER_STG);

            setWindowAndGo(WEB_DRIVER,URL);
        } catch (TimeoutException | InterruptedException exception){
            LOGGER.info("Timeout exception to get URL page\n"+exception);
        }
    }

    @AfterAll
    static void tearDown() {
        WEB_DRIVER.quit();

        LOGGER.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @DisplayName("Verify country of origin")
    @Test
    void countryTest(){
        try {
            String COUNTRY = "Colombia";
            assertEquals(COUNTRY,mainPageGoogle.countryGoogle());

            LOGGER.info("PASSED\t"+COUNTRY +" was found on title of Google");

        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }
    }

    @DisplayName("Easy search on Google and verify title")
    @Test
    void searchTest(){
        try {
            String search = "Mechatroniker";

            mainPageGoogle.searchGoogle(search);
            mainPageGoogle.clkSearch();

            String namePage = WEB_DRIVER.getTitle();
            assertTrue(namePage.contains(search));

            LOGGER.info("PASSED\t"+search+" was found on title of Google");
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }
    }

}
