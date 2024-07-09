package com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyChromeDriverPath {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        String driverPath = "C:\\Projects\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Print the driver path to verify it
        System.out.println("ChromeDriver path: " + System.getProperty("webdriver.chrome.driver"));

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Gmail
        driver.get("https://www.gmail.com");

        // Your test code here

        // Close the driver
        driver.quit();
    }
}
