package org.example.SDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.currencyPage;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class currency {
   currencyPage homepage = new currencyPage();
    SoftAssert soft = new SoftAssert();

    @Given("user click on currencies select")
    public void go_to_website_page() {
        homepage.select_euro().selectByIndex(1);

    }


    @Then("verify Euro Symbol")
    public void verify_euro(){
        String euro_element =null;
        for (int i = 0; i < 4; i++) {
            List<WebElement> elements =  homepage.text_ver();
            euro_element = elements.get(i).getText();
        }
        String expected = "€";
        soft.assertTrue(euro_element.contains(expected));
        soft.assertAll();
    }
}
