package org.example.Pages;

import org.example.SDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registerPage {
    public WebElement Link(){
        return   Hooks.driver.findElement(By.className("ico-register"));

    }
    public WebElement firstName(){
        return Hooks.driver.findElement(By.id("FirstName"));

    }
    public WebElement lastName(){
        return Hooks.driver.findElement(By.id("LastName"));

    }
    public WebElement Male(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public void Day(String dd){
        WebElement element = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select dayNum = new Select(element);
        dayNum.selectByValue(dd);
    }
    public void Month(String m){
        WebElement element = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select monthNum = new Select(element);
        monthNum.selectByValue(m);
    }
    public void Year(String y){
        WebElement element = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select yearNum = new Select(element);
        yearNum.selectByValue(y);
    }
    public WebElement Email(){
        return Hooks.driver.findElement(By.id("Email"));
    }


    public WebElement Password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement ConfirmPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButton(){
        return Hooks.driver.findElement(By.id("register-button"));

    }
    public WebElement MessageColor(){
        return Hooks.driver.findElement(By.className("result"));
    }
}
