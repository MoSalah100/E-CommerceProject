package org.example.SDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.registerPage;
import org.testng.asserts.SoftAssert;

public class reg {
    registerPage register = new registerPage();
    SoftAssert softAssert = new SoftAssert();


    @Given("user navigate to register page")
    public void goRegisterPage()
    {
        register.Link().click();

    }

    @When("select gender")
    public void gender_type(){
        register.Male().click();
    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void enter_name(String fname,String lname){
        register.firstName().sendKeys(fname);
        register.lastName().sendKeys(lname);
    }
    @And("user enter date of birth")
    public void enter_date(){
        register.Day("15");
        register.Month("9");
        register.Year("1995");
    }
    @And("^user enter email \"(.*)\" field$")
    public void enter_email(String email){
        register.Email().sendKeys(email);
    }
    @And("^user fills Password fields \"(.*)\" \"(.*)\"$")
    public void enter_password(String pass,String pass1){
        register.Password().sendKeys(pass);
        register.ConfirmPassword().sendKeys(pass1);
    }
    @And("clicks on register button")
    public void click_register_button(){
        register.registerButton().click();
    }
    @Then("message is displayed")
    public void success_message(){
        String expectedMessage = "Your registration completed";
        String actualMessage = "Your registration completed";
        String color =register.MessageColor().getCssValue("color");
        String expectedColor= "green";
        softAssert.assertTrue(actualMessage.contains(expectedMessage));
        softAssert.assertTrue(color.contains(expectedColor));

    }


}
