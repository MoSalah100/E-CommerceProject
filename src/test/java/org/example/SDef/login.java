package org.example.SDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.loginPage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class login {
    loginPage login = new loginPage();
    SoftAssert soft = new SoftAssert();


    @Given("user navigate to login page")
    public void go_to_login_page(){
        login.link().click();

    }

    @When("^user login with \"(.*)\" \"(.*)\" and \"(.*)\"$")
    public void valid_login(String t,String email , String password){
        login.enter_email(t).sendKeys(email);
        login.enter_password().sendKeys(password);
        login.remember().click();
    }

    @And("user press on login button")
    public void press_login_button(){
        login.login_button().click();
        // login.enter_password().sendKeys(Keys.ENTER);
    }

    @Then("user login to the system successfully")
    public void success_login(){
        String expectedUrl= "https://demo.nopcommerce.com/";
        String url=  login.getUrl();
        soft.assertTrue(url.contains(expectedUrl));
        soft.assertTrue(login.is_display().isDisplayed());
        soft.assertAll();


    }
    @Then("user could not login to the system")
    public void failed_login(){
        String error_expected = "Login was unsuccessful.";
        String actual_failed_message=login.failed_message().getText();
        soft.assertTrue(actual_failed_message.contains(error_expected));
        String color_msg = login.failed_message_color().getCssValue("color");
        System.out.println(Color.fromString("rgba(228, 67, 75,1)").asRgba());
        System.out.println(color_msg);
        soft.assertEquals(color_msg,Color.fromString("rgba(228, 67, 75,1)").asRgba());
        soft.assertAll();


    }
}
