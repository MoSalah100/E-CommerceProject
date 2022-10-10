package org.example.Pages;

import org.example.SDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchPage {
    public WebElement field(){
        WebElement search_link = Hooks.driver.findElement(By.name("q"));
        return search_link ;
    }
    public List<WebElement> getData(){
        List<WebElement> sameText=  Hooks.driver.findElements(By.className("item-box"));
        //  List<WebElement> sameText=  Hooks.driver.findElements(By.className("product-title"));

        return sameText ;
    }
    public WebElement click_on_product(){
        WebElement element= Hooks.driver.findElement(By.className("picture"));
        return element;
    }
    public WebElement get_product_serial_text(){

        WebElement element = Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]>span[class=\"value\"]"));

        return element;
    }
}
