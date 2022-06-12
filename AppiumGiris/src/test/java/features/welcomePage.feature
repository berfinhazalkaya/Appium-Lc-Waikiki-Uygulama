@WelcomePage
Feature: Welcome Page

  @Check @Components
  Scenario Outline: Check Welcome Page Components
    Given Berfin is opened LcWaikiki App
    Then should see "<title>" Title
    Then should see "<desc>" title decsription
    When should see Atla button
    Examples:
    |    title      |        desc        |
    |PRATİK ALT MENÜ| Yenilenen alt menü |


  @Click
  Scenario: Click Button
    Given Berfin is opened LcWaikiki App
    When click Atla button
    Then should see Home Page
    When click Profil button

  @WriteProfil
  Scenario: Write Profile
    Given Berfin is opened LcWaikiki App
    When click Atla button
    Then should see Home Page
    When click Profil button
    When Eposta adresine "berfin@gmail.com" yaz
    When sifreye "123456789" yaz
    When sifreyi goster butonuna bas
    When Giris yap butonuna tıkla
    Then mesaji kontrol et
    When cikan mesaji yazdır
#    When Eposta hata mesajini yazdir
#    When Sifre hata mesajini yazdir






