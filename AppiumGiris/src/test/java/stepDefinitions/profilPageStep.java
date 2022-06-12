package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class profilPageStep {

    pages.profilePage profilePage = new pages.profilePage(DriverFactory.getDriver());

    @When("Eposta adresine {string} yaz")
    public void epostaAdresineYaz(String ePosta) {
        profilePage.writeEposta(ePosta);
    }

    @When("sifreye {string} yaz")
    public void sifreyeYaz(String psw) {
        profilePage.writePassword(psw);
    }

    @When("sifreyi goster butonuna bas")
    public void sifreyiGosterButonunaBas() {
        profilePage.sifreyiGoster();
    }

    @When("Giris yap butonuna tıkla")
    public void girisYapButonunaTıkla() {
        profilePage.clickGirisYap();
    }

    @Then("mesaji kontrol et")
    public void mesajiKontrolEt() {
        profilePage.checkErrorMessage();
    }

    @When("cikan mesaji yazdır")
    public void cikanMesajiYazdır() {
        profilePage.mesajyazdir();
    }



//    @When("Eposta hata mesajini yazdir")
//    public void epostaHataMesajiniYazdir() {
//        profilePage.checkEpostaError();
//
//    }
//
//    @When("Sifre hata mesajini yazdir")
//    public void sifreHataMesajiniYazdir() {
//        profilePage.checkPasswordError();
//    }


}