package workshop.selenium.java.pom.store;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class ClothesStore {
    private final WebDriver DRIVER_USED;

    private final By T_SHIRT_SECTION = By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");
    private final By ADD_CART_BTN = By.cssSelector("#center_column a.button.ajax_add_to_cart_button.btn.btn-default");
    private final By CHECKOUT_BTN = By.cssSelector("[style*=\"display: block;\"] .button-container > a");
    private final By CHECK2_BTN = By.cssSelector(".cart_navigation span");
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
    }

    public void clkAddCartBtn(){
        DRIVER_USED.findElement(ADD_CART_BTN).click();
    }

    public void clkCheckoutBtn(){
        DRIVER_USED.findElement(CHECKOUT_BTN).click();
    }


    public void clkCheckoutBtn2(){
        DRIVER_USED.findElement(CHECK2_BTN).click();
    }

    public void logInClothes(String email, String password){
        DRIVER_USED.findElement(EMAIL).sendKeys(email);
        DRIVER_USED.findElement(PSWD).sendKeys(password);
        DRIVER_USED.findElement(LOGIN_SUBMIT).click();
    }

    public void clkCheckoutBtn3(){
        DRIVER_USED.findElement(CHECK3_BTN).click();
    }

    public void agreeTermsCheck(){
        DRIVER_USED.findElement(AGREE_TERMS_CHECK).click();
    }

    public void clkCheckoutBtn4(){
        DRIVER_USED.findElement(CHECK4_BTN).click();
    }

    public void payBankSelection(){
        DRIVER_USED.findElement(PAY_BANK).click();
    }

    public void confirmOrder(){
        DRIVER_USED.findElement(CONF_ORDER).click();
    }

    public void acceptanceResult(){
        DRIVER_USED.findElement(ACCEP_RESULT).click();
    }

}
