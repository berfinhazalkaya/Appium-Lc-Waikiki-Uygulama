package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class homePage {

    By atla_btn = By.id("com.lcwaikiki.android:id/tvNext");
    By barcodeTitle = By.id("com.lcwaikiki.android:id/barcodeTitleText"); //Sadece homa page'de var
    By profile_btn = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Profil\")");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public homePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }


    public void clickAtlaButton() {
       driver.findElement(atla_btn).click();
    }


    public void checkHomePage() {
        elementHelper.checkElementPresence(barcodeTitle);
    }

    public void clickProfileButton() {
        driver.findElement(profile_btn).click();
    }
}
