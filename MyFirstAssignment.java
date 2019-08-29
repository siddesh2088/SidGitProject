package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("sid2088");
		driver.findElement(By.id("password")).sendKeys("Versace12#$");
		driver.findElement(By.name("proceed")).click();
		
	}

}
