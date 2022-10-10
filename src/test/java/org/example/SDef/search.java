package org.example.SDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.searchPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class search {

    searchPage searchPage = new searchPage();
    SoftAssert soft = new SoftAssert();
    @Given("user click on search field")
    public void search()
    {
        searchPage.field().click();
    }

    @And("user search with {string}")
    public void userSearchWith(String text) {
        searchPage.field().sendKeys(text);
        searchPage.field().sendKeys(Keys.ENTER);
    }

    @Then("user could find  {string} relative words")
    public void userCouldFindRelativeWords(String word) {
        String text = null;
        for (int i = 0; i < searchPage.getData().size(); i++) {
            text = searchPage.getData().get(i).getText().toLowerCase();
        }
        soft.assertTrue(text.contains(word));
        String url_expected="https://demo.nopcommerce.com/search?q=";
        String url = Hooks.driver.getCurrentUrl();
        soft.assertTrue(url.contains(url_expected));
        soft.assertAll();

    }

    @Then("user could find  {string} inside product detail page")
    public void userCouldFindInsideProductDetailPage(String word1) {
        searchPage.click_on_product().click();
        String serial_text =  searchPage.get_product_serial_text().getText();
        Assert.assertTrue(word1.contains(serial_text));


    }
}
