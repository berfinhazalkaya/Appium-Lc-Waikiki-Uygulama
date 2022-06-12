package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class welcomePage {

    By txt_title = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvTitle\")");
    By txt_desc = By.id("com.lcwaikiki.android:id/tvContent");
    By icon = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/ivTutorial\")");
    By next_buton = By.id("com.lcwaikiki.android:id/tvNext");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public welcomePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkAppIcon() {
        elementHelper.checkElementPresence(icon);
    }

    public void checkTitle(String title) {
         elementHelper.checkElementText(txt_title,title);
    }

    public void checkTitleDescription(String desc) {
        elementHelper.checkElementText(txt_desc,desc); //txt_desc ve desc'i karşılaştırdık
    }

    public void checkButton() {
          elementHelper.checkElementPresence(next_buton);
    }
}
