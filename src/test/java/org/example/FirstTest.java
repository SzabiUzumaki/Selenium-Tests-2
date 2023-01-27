package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


import static org.openqa.selenium.Keys.HOME;
import static org.testng.Assert.*;

public class Login_aTest {

    @Test
    void firstBasicTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://github.com/andrejs-ps/?tab=repositories");

        WebElement counter = driver.findElements(By.className("Counter")).get(0);
        List<WebElement> repos = driver.findElements(By.xpath("//div[@id='user-repositories-list']"));

        Assert.assertEquals(Integer.parseInt(counter.getText()), repos.size());

        driver.close();
    }

}