package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class profilePage {

    By eposta = By.id("com.lcwaikiki.android:id/edtEmail");
    By password = By.id("com.lcwaikiki.android:id/edtPassword");
    By girisYap = By.id("com.lcwaikiki.android:id/buttonLogin");
//    By ePostaError = By.id("com.lcwaikiki.android:id/errortextEmail");
//    By sifreError = By.id("com.lcwaikiki.android:id/errortextPassword");
    By sifreyigoster = By.id("com.lcwaikiki.android:id/text_input_end_icon");
    By mesaj = By.id("com.lcwaikiki.android:id/slideDownText");

   
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public profilePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void writeEposta(String ePosta) {
        driver.findElement(eposta).sendKeys(ePosta);
    }

    public void writePassword(String psw) {
        driver.findElement(password).sendKeys(psw);
    }

    public void sifreyiGoster() {
        driver.findElement(sifreyigoster).click();
    }

    public void clickGirisYap() {
        driver.findElement(girisYap).click();
    }

    public void checkErrorMessage() {
        elementHelper.checkElementVisible(mesaj);
    }

    public void mesajyazdir() {
        String error = driver.findElement(mesaj).getText();
        System.out.println(error);
    }


//    public void checkEpostaError() {
//        String error1 = driver.findElement(ePostaError).getText();
//        System.out.println(error1);
//    }
//
//    public void checkPasswordError() {
//        String error2 = driver.findElement(sifreError).getText();
//        System.out.println(error2);
//    }


}
