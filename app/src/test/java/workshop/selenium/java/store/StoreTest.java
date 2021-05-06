package workshop.selenium.java.store;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.*;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.opentest4j.AssertionFailedError;
import workshop.selenium.java.pom.store.ClothesStore;
import workshop.selenium.java.settings.WebSite;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StoreTest extends WebSite {
    private static final int BROWSER_CHN = 1;
    private static final boolean HEAD = false;
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

    @BeforeEach
    void before(){
        WEB_DRIVER.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
    }

    @Test
    @Order(1)
    @DisplayName("Select T-Shirt section on page")
    void testStorePage(){
        try {
            clothesStore.selTShirtSection();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }
    }

    @Test
    @Order(2)
    @DisplayName("Add cart click button")
    void testStorePage02(){
        try {
            clothesStore.clkAddCartBtn();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(3)
    @DisplayName("First click checkout button")
    void testStorePage03(){
        try {
            clothesStore.clkCheckoutBtn();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(4)
    @DisplayName("Second click checkout button")
    void testStorePage04(){
        try {
            clothesStore.clkCheckoutBtn2();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(5)
    @DisplayName("Log-in user")
    void testStorePage05(){
        try {
            clothesStore.logInClothes("aperdomobo@gmail.com","WorkshopProtractor");
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(6)
    @DisplayName("Third click checkout button")
    void testStorePage06(){
        try {
            clothesStore.clkCheckoutBtn3();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(7)
    @DisplayName("Agree terms of page to buy")
    void testStorePage07(){
        try {
            clothesStore.agreeTermsCheck();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(8)
    @DisplayName("Fourth click checkout button")
    void testStorePage08(){
        try {
            clothesStore.clkCheckoutBtn4();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(9)
    @DisplayName("Pay bank selection option")
    void testStorePage09(){
        try {
            clothesStore.payBankSelection();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(10)
    @DisplayName("Confirm order click selector")
    void testStorePage10(){
        try {
            clothesStore.confirmOrder();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(11)
    void testStorePage11(){
        try {
            clothesStore.acceptanceResult();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }
    }
}
