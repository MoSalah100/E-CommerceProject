package org.example.Pages;

import org.example.SDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class currencyPage {
    public Select select_euro() {
        Select select = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        return select;
    }

    public List<WebElement> text_ver() {
        List<WebElement> elements = Hooks.driver.findElements(By.className("price"));
        return elements;
    }
}
