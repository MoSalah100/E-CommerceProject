package org.example.SDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.sliderPage;
import org.testng.Assert;

public class slider {
    sliderPage sliderPage = new sliderPage();
    @Given("user find  slider and user will ask if it is clickable or not")
    public void is_clickable(){
        sliderPage.slider().isEnabled();

    }

    @Then("user will ask if it the same {string}")
    public void userWillAskIfItTheSame(String url) {
        String expected_link=url;
        sliderPage.click().click();
        String link= Hooks.driver.getCurrentUrl();
        Assert.assertFalse(link.contains(expected_link));

    }

}
