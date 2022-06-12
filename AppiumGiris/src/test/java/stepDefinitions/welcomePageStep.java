package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import util.DriverFactory;

public class welcomePageStep {

    pages.welcomePage welcomePage = new pages.welcomePage(DriverFactory.getDriver());


    @Given("Berfin is opened LcWaikiki App")
    public void berfinIsOpenedLcWaikikiApp() {
        welcomePage.checkAppIcon();
    }

    @Then("should see {string} Title")
    public void shouldSeeTitle(String title) {
        welcomePage.checkTitle(title);
    }

    @Then("should see {string} title decsription")
    public void shouldSeeDescTitleDecsription(String desc) {
        welcomePage.checkTitleDescription(desc);
    }

    @Then("should see Atla button")
    public void shouldSeeAtlaButton() {
        welcomePage.checkButton();
    }


}