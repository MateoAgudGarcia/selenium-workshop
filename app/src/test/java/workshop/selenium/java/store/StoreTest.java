package workshop.selenium.java.store;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.*;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.opentest4j.AssertionFailedError;
import workshop.selenium.java.pom.store.ClothesStore;
import workshop.selenium.java.settings.WebSite;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StoreTest extends WebSite {
    private static final int BROWSER_CHN = 1;
    private static final boolean HEAD = true;
    private static final String URL = "http://automationpractice.com/";

    private static final WebDriver WEB_DRIVER = browser(BROWSER_CHN,HEAD);
    private static final Logger LOGGER = Logger.getLogger(StoreTest.class);
    private static final String DRIVER_STG = browSelec(BROWSER_CHN,HEAD);

    ClothesStore clothesStore = new ClothesStore(WEB_DRIVER);

    @BeforeAll
    static void setUp(){
        try {
            PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\main\\resources\\log4j-test.properties");
            LOGGER.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+StoreTest.class.getName());
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

    @Test
    @Order(1)
    @DisplayName("Test")
    void testStorePage(){
        try {
            clothesStore.selTShirtSection();

            clothesStore.clkAddCartBtn();

            clothesStore.clkCheckoutBtn();

            clothesStore.clkCheckoutBtn2();

            clothesStore.logInClothes("aperdomobo@gmail.com","WorkshopProtractor");

            clothesStore.clkCheckoutBtn3();

            clothesStore.agreeTermsCheck();

            clothesStore.clkCheckoutBtn4();

            clothesStore.payBankSelection();

            clothesStore.confirmOrder();

            clothesStore.acceptanceResult();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }
    }
}
