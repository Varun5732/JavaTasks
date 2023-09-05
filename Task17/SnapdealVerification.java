package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealVerification {

    @SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
    	
    		WebDriver driver = new ChromeDriver();
    		driver.manage().window().maximize();

            driver.get("https://www.snapdeal.com/login");

            WebElement userNameField = driver.findElement(By.id("userName"));
            userNameField.sendKeys("varunsuresh89@gmail.com");
           
            WebElement loginButton = driver.findElement(By.id("checkUser"));
            loginButton.click();
            WebElement loginUsingOtp = driver.findElement(By.id("loginUsingOtp"));
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            String url = driver.getCurrentUrl();
            System.out.println("url:+" +driver.getTitle());
            System.out.println("url:+"+driver.getCurrentUrl());
           
        
    }
}
