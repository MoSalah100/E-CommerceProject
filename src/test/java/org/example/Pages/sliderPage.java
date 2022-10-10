package org.example.Pages;

import org.example.SDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sliderPage {
    public WebElement slider(){


        WebElement slider_element=    Hooks.driver.findElement(By.className("class=\"nivo-imageLink\""));
        return slider_element;
    }
    public WebElement click(){


        WebElement slider_Click= Hooks.driver.findElement(By.className("class=\\\"nivo-imageLink\\\"\""));
        return slider_Click;
    }
}
