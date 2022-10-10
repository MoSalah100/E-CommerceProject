package org.example.Pages;

import org.example.SDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class categoryPage {

    public List<WebElement> elementHover() {
        List<WebElement> elements = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        return  elements;
    }




    public List<WebElement> find_element(){
        int random1 = new Random(3).nextInt();
        List <WebElement> element = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        return element;
    }
}
