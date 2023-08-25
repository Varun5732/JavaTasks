package com.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia { public static void main(String[] args) {

	
	WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.get("https://www.wikipedia.org/");

    WebElement searchInput = driver.findElement(By.name("search"));
    searchInput.sendKeys("AI");
    searchInput.submit();


    WebElement aiPageLink = driver.findElement(By.linkText("Artificial intelligence"));
    aiPageLink.click();

    
    WebElement historySection = driver.findElement(By.id("History"));
    historySection.click();
    System.out.println(historySection.getText());
    driver.quit();
	}
}
