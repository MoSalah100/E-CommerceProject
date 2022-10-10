package org.example.SDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.Pages.categoryPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class category {
    categoryPage categoryPage = new categoryPage();


    @Given("hover to random element")
    public void hoverToRandomElement() {
        List<WebElement> allElements= categoryPage.elementHover();
        int random = new Random().nextInt(3);
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(allElements.get(random)).perform();



    }

    @And("user click on any category and verify text")
    public void userClickOnAnyCategory() {
        int random = new Random().nextInt(3);
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(categoryPage.find_element().get(random)).click().release().build().perform();
        String text =  categoryPage.find_element().get(random).getText();
        Assert.assertTrue(text.contains(categoryPage.find_element().get(random).getText()));



    }
}
