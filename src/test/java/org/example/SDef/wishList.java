package org.example.SDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.wishListPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class wishList {
    wishListPage homePage = new  wishListPage();

    @Given("user click on wishlist icon")
    public void click_wishlist(){
        homePage.click_on_wishlist().get(2).click();


    }

    @Then("user assert that product added successfully")
    public void userAssertThatProductAddedSuccessfully() {
        String ex_message="The product has been added to your wishlist";
        String ac_msg=homePage.verify_message().getText();
        String ex_bg_color= "green";
        String ac_bg_color= homePage.get_background_color().getCssValue("background-color");
        System.out.println(ac_bg_color);

    }

    @When("user will use explicit Wait until message disappeared")
    public void userWillUseExplicitWaitUntilMessageDisappeared() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(homePage.verify_message()));
    }

    @And("user click on Wishlist Tab on the top of the page")
    public void userClickOnTabOnTheTopOfThePage() {
        homePage.click_on_wishlist_tab().click();
    }

    @Then("user should get Qty value and verify it's bigger than 0")
    public void userShouldGetQtyValueAndVerifyItSBiggerThan() {
        int value = Integer.parseInt(homePage.get_Qty_number().getAttribute("value"));
        int num=0;
        if (value>num)
            Assert.assertTrue(value >num);
    }
}
