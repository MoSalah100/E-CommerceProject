package org.example.SDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.followPage;
import org.testng.Assert;

import java.util.ArrayList;

public class follow {
    followPage homePage = new followPage();

    @Given("user opens facebook link")
    public void user_opens_facebook_link(){
        homePage.open_facebook().click();

    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink() {
        homePage.open_twitter().click();

    }

    @Given("user opens rss link")
    public void userOpensRssLink() {
        homePage.open_rss().click();
    }

    @Given("user opens youtube link")
    public void userOpensYoutubeLink() {
        homePage.open_youtube().click();
    }


    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String window) {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(window));

    }
}
