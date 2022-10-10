package org.example.Pages;

import org.example.SDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage {
    public WebElement link(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement enter_email(String t){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement enter_password(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement remember(){
        return Hooks.driver.findElement(By.id("RememberMe"));
    }
    public WebElement login_button(){


        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public String getUrl(){
        return    Hooks.driver.getCurrentUrl();
    }
    public WebElement is_display(){
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement failed_message(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));


    }
    public WebElement failed_message_color(){
        return Hooks.driver.findElement(By.className("message-error"));
    }

}
