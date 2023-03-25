package Npack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewTest2 {
	@Test
	public static void Test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		WebElement buttonElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        // Click on the button
        buttonElement.click();
        
        WebElement inputBoxElement = driver.findElement(By.id("ap_email"));
		inputBoxElement.sendKeys("tunde@testingtesting.com");
		 
		
		WebElement buttonElement2 = driver.findElement(By.id("continue"));
		 buttonElement2.click();
		
		System.out.println("Its working");
	}

	
	@Test
	public static void Test3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("Its working too");
	}
	

	@Test
	public static void Test4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("Its working also");
	}
}
