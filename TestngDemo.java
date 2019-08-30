package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestngDemo {
	WebDriver driver;
  @Test
  public void ngLoginTest() {
	  	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("sid2088");
		driver.findElement(By.id("password")).sendKeys("Versace12#$");
		driver.findElement(By.name("proceed")).click();
		
		String expectedTitleAfterLogin = "Rediffmail";
		String actualTitleAfterLogin = driver.getTitle();
		
		if (actualTitleAfterLogin.equals(expectedTitleAfterLogin))
			System.out.println("Login Test Passed!");
		else
			System.out.println("Login Test Failed!");
  }
  @Test
  public void testGoogleSearch() throws InterruptedException {
	  driver.get("http://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Jobs in Selenium");
	  Thread.sleep(4000);
  }
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  /*@BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
*/
}
