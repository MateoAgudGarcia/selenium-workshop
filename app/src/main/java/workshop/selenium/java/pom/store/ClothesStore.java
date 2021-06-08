package workshop.selenium.java.pom.store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import workshop.selenium.java.settings.setWait;

public class ClothesStore implements setWait {
    private final WebDriver DRIVER_USED;

    private final By T_SHIRT_SECTION = By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");
    private final By ADD_CART_BTN = By.cssSelector(".ajax_add_to_cart_button > span");
    private final By CHECKOUT_BTN = By.cssSelector("a.btn.btn-default.button.button-medium");
    private final By CHECK2_BTN = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span");
    private final By EMAIL = By.cssSelector("#email");
    private final By PSWD = By.cssSelector("#passwd");
    private final By LOGIN_SUBMIT = By.cssSelector("#SubmitLogin > span");
    private final By CHECK3_BTN = By.cssSelector("#center_column > form > p > button > span");
    private final By AGREE_TERMS_CHECK = By.cssSelector("#cgv");
    private final By CHECK4_BTN = By.cssSelector("#form > p > button > span");
    private final By PAY_BANK = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    private final By CONF_ORDER = By.cssSelector("#cart_navigation > button > span");
    private final By ACCEP_RESULT = By.cssSelector("#center_column > div > p > strong");

    public ClothesStore(WebDriver DRIVER_USED) {
        this.DRIVER_USED = DRIVER_USED;
    }

    public void selTShirtSection(){
        DRIVER_USED.findElement(T_SHIRT_SECTION).click();
        explicitFluentWait(T_SHIRT_SECTION);
    }

    public void clkAddCartBtn(){
        DRIVER_USED.findElement(ADD_CART_BTN).click();
        explicitFluentWait(ADD_CART_BTN);
    }

    public void clkCheckoutBtn(){
        DRIVER_USED.findElement(CHECKOUT_BTN).click();
        explicitFluentWait(CHECKOUT_BTN);
    }


    public void clkCheckoutBtn2(){
        DRIVER_USED.findElement(CHECK2_BTN).click();
        explicitFluentWait(CHECK2_BTN);
    }

    public void logInClothes(String email, String password){
        DRIVER_USED.findElement(EMAIL).sendKeys(email);
        explicitFluentWait(EMAIL);
        DRIVER_USED.findElement(PSWD).sendKeys(password);
        explicitFluentWait(PSWD);
        DRIVER_USED.findElement(LOGIN_SUBMIT).click();
        explicitFluentWait(LOGIN_SUBMIT);
    }

    public void clkCheckoutBtn3(){
        DRIVER_USED.findElement(CHECK3_BTN).click();
        explicitFluentWait(CHECK3_BTN);
    }

    public void agreeTermsCheck(){
        DRIVER_USED.findElement(AGREE_TERMS_CHECK).click();
        explicitFluentWait(AGREE_TERMS_CHECK);
    }

    public void clkCheckoutBtn4(){
        DRIVER_USED.findElement(CHECK4_BTN).click();
        explicitFluentWait(CHECK4_BTN);
    }

    public void payBankSelection(){
        DRIVER_USED.findElement(PAY_BANK).click();
        explicitFluentWait(PAY_BANK);
    }

    public void confirmOrder(){
        DRIVER_USED.findElement(CONF_ORDER).click();
        explicitFluentWait(CONF_ORDER);
    }

    public void acceptanceResult(){
        DRIVER_USED.findElement(ACCEP_RESULT).click();
        explicitFluentWait(ACCEP_RESULT);
    }

    void explicitFluentWait(By defaultBy){
        explicitWait(defaultBy,DRIVER_USED);
    }

}
