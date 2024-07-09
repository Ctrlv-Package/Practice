package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GmailTryCatchDemo {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        String driverPath = "C:\\Projects\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Gmail
            driver.get("https://www.gmail.com");

            // Maximize window
            driver.manage().window().maximize();

            // Wait for the email field to be visible and enter Email Address 
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
            emailField.sendKeys("pedrovenereo@gmail.com");

            // Wait for the Next button to be clickable and click it
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='identifierNext']/div/button/span")));
            nextButton.click();

            // Wait for the title to contain "Gmail" (or adjust this condition as needed)
            wait.until(ExpectedConditions.titleContains("Gmail"));

            // Test the title
            String expectedTitle = "Gmail";  // Ensure this is the accurate expected title
            String actualTitle = driver.getTitle();

            if (expectedTitle.equalsIgnoreCase(actualTitle)) {
                System.out.println("Title Confirmed");
            } else {
                System.out.println("Title does not match");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the driver
            driver.quit();
        }
    }
}
