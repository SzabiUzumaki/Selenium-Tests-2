package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\44771\\Desktop\\Programming\\Tests\\Selenium-Tests-2\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo/");

        driver.findElement(By.name("first_name")).sendKeys("Piotr");
        driver.findElement(By.name("last_name")).sendKeys("Szabat");
        driver.findElement(By.name("business_name")).sendKeys("Szabi");
        driver.findElement(By.name("email")).sendKeys("Piotrszabat5@gmail.com");
        var x = driver.findElement(By.id("numb1")).getText();
        int a = Integer.parseInt(x);
        var y = driver.findElement(By.id("numb2")).getText();
        int b = Integer.parseInt(y);
        System.out.println(a);
        System.out.println(b);
        int result = a + b;
        System.out.println(result);
        driver.findElement(By.id("number")).sendKeys(String.valueOf(result));
        driver.findElement(By.id("demo")).click();

    }
}
