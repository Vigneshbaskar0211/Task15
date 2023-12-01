package seleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBrowser {

	private static WebDriver webDriver;

	public static void main(String[] args) throws InterruptedException {
	
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Open Google
        driver.get("https://www.google.com");
        
        //maximize window
        driver.manage().window().maximize();

        // Find the search input field by name
        WebElement searchBox = driver.findElement(By.name("q"));
        
        // Enter "Selenium Browser Driver" in the search field
        searchBox.sendKeys("Selenium Browser Driver");
        
        // Submit the search
        searchBox.submit();
        
        // Wait for a few seconds (you might need explicit waits for better handling)
 
        Thread.sleep(3000);
        
        // Close the browser

        driver.quit();


	}

}
