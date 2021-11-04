package runner;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner{
	
	@Test
	public void hello() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raoniii\\Documents\\workspace\\Final\\driver\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://www.advantageonlineshopping.com/#/register");
        browser.findElement(By.name("username")).sendKeys("fulano");
        //browser.findElement(By.id("userName")).sendKeys("fulano");
        

     
	}

}
