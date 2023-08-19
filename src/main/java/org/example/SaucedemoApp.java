package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SaucedemoApp {

    public static WebDriver driver;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        System.out.println("Hello world!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Desktop\\SelChromre\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/v1/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
//		 driver.close();//close current window
        driver.quit();//close all window open by automation.

    }
    @Test
    public void ma1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Desktop\\SelChromre\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/v1/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
//		 driver.close();//close current window
//        driver.quit();//close all window open by automation.
        driver.findElement(By.id("login-button")).click();

    }
//    @Test
//    public void ma2(){
//        driver.findElement(By.name("user-name")).sendKeys("standard_user");
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//    }
}