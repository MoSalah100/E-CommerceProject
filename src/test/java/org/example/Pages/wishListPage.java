package org.example.Pages;

import org.example.SDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class wishListPage {
    public List<WebElement> click_on_wishlist(){
        List<WebElement> elements= Hooks.driver.findElements(By.cssSelector(" button[class=\"button-2 add-to-wishlist-button\"]"));
//        WebElement element=  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[3]"));
        return  elements;
    }
    public WebElement verify_message(){
        WebElement element1 = Hooks.driver.findElement(By.className("content"));

        return element1;

    }
    public WebElement get_background_color(){
        WebElement element3 = Hooks.driver.findElement(By.className("bar-notification"));
        return element3;
    }
    public WebElement click_on_wishlist_tab(){
        WebElement element4 = Hooks.driver.findElement(By.className("ico-wishlist"));
        return element4;
    }
    public WebElement get_Qty_number(){
        WebElement element5 = Hooks.driver.findElement(By.className("qty-input"));
        return element5;
    }
}
