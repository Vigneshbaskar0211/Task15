package seleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScript {
    public static void main(String[] args) {
       

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");
        
        
        
        //maximize window
        driver.manage().window().maximize();

        // Find the search input field by name
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter "Selenium Browser Driver" in the search field
        searchBox.sendKeys("Selenium");

        // Submit the search
        searchBox.submit();

        // Wait for a few seconds (you might need explicit waits for better handling)
        try {
            Thread.sleep(3000); // 3 seconds delay to see the result
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
