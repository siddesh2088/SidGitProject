package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstWDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		/*System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver-64bit.exe");
		driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://selenium-examples.nichethyself.com/");
		driver.findElement(By.id("loginname")).sendKeys("stc123");   //goes to login id test field and types
		
		/*WebElement myElement = driver.findElement(By.id("loginname"));
		myElement.sendKeys("stc123");*/
		
		driver.findElement(By.id("loginpassword")).sendKeys("12345");  //goes to login password test field and types
		driver.findElement(By.id("loginbutton")).click();              //clicks the logon button
		//driver.quit();
		
		String expectedTitleAfterLogin = "My account";
		String actualTitleAfterLogin = driver.getTitle();
		
		if (actualTitleAfterLogin.equals(expectedTitleAfterLogin))
			System.out.println("Login Test Passed!");
		else
			System.out.println("Login Test Failed!");
	}

}
