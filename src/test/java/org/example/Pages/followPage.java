package org.example.Pages;

import org.example.SDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class followPage {
    public WebElement open_facebook(){
        WebElement element=   Hooks.driver.findElement(By.linkText("Facebook"));
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return element;

    }
    public WebElement open_twitter(){
        WebElement element=   Hooks.driver.findElement(By.linkText("Twitter"));
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return element;
    }
    public WebElement open_rss(){
        WebElement element=   Hooks.driver.findElement(By.linkText("RSS"));
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return element;
    }
    public WebElement open_youtube(){
        WebElement element=  Hooks.driver.findElement(By.linkText("YouTube"));
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return element;
    }

}
