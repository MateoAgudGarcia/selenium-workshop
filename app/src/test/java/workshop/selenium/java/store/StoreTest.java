package workshop.selenium.java.store;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
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
    void testStorePage(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC01).click();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }
    }

    @Test
    @Order(2)
    void testStorePage02(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC02).click();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(3)
    void testStorePage03(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC03).click();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(4)
    void testStorePage04(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC04).click();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(5)
    void testStorePage05(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC05).sendKeys("aperdomobo@gmail.com");
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(6)
    void testStorePage06(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC06).sendKeys("WorkshopProtractor");
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(7)
    void testStorePage07(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC07).click();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(8)
    void testStorePage08(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC08).click();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(9)
    void testStorePage09(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC09).click();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(10)
    void testStorePage10(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC10).click();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(11)
    void testStorePage11(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC11).click();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(12)
    void testStorePage12(){
        try {
            WEB_DRIVER.findElement(clothesStore.LOC12).click();
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }

    @Test
    @Order(13)
    void testStorePage13(){
        try {
            assertEquals("Your order on My Store is complete.",WEB_DRIVER.findElement(clothesStore.LOC13).getText());
        } catch (Exception | AssertionFailedError exception){
            LOGGER.error(errMsg()+exception.getMessage());
            throw new AssertionError(errMsg()+exception.getMessage());
        }

    }
}
