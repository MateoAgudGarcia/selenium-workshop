package workshop.selenium.java.pom.store;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class ClothesStore {
    private final WebDriver DRIVER_USED;

    public By LOC01 = By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");
    public By LOC02 = By.cssSelector("#center_column a.button.ajax_add_to_cart_button.btn.btn-default");
    public By LOC03 = By.cssSelector("[style*=\"display: block;\"] .button-container > a");
    public By LOC04 = By.cssSelector(".cart_navigation span");
    public By LOC05 = By.cssSelector("#email");
    public By LOC06 = By.cssSelector("#passwd");
    public By LOC07 = By.cssSelector("#SubmitLogin > span");
    public By LOC08 = By.cssSelector("#center_column > form > p > button > span");
    public By LOC09 = By.cssSelector("#cgv");
    public By LOC10 = By.cssSelector("#form > p > button > span");
    public By LOC11 = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    public By LOC12 = By.cssSelector("#cart_navigation > button > span");
    public By LOC13 = By.cssSelector("#center_column > div > p > strong");

    public ClothesStore(WebDriver DRIVER_USED) {
        this.DRIVER_USED = DRIVER_USED;
    }
}
