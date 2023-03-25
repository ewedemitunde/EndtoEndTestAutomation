package Npack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test23 {

	@Test
	public static void test23() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jiji.ng/");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("This is working");
		
	}
}