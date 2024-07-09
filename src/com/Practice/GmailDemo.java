package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDemo {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        String driverPath = "C:\\Projects\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Gmail
        driver.get("https://www.gmail.com");

        //Maximize window
        driver.manage().window().maximize();
        
        //Enter Email Address 
        driver.findElement(By.id("identifierId")).sendKeys("pedrovenereo@gmail.com");
        
        //Click Next 
        driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();
        
        //Test
        String expectedTitle = driver.getTitle();
        String actualTitle = "gmail";
        
        if(expectedTitle.equalsIgnoreCase(actualTitle))
        {
        	System.out.println("Title Confirmed");
        }
        else
        {
        	System.out.println("Title does not match");
        }
        
        // Close the driver
        driver.quit();
    }
}
