package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GoogleLinksPrintDemo {
	WebDriver driver;
  @Test
  public void printAllGoogleLinks() {
	  driver.get("http://www.google.com");
	  List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));
	  //List<WebElement> allGoogleLinks = driver.findElement(By.xpath("//a"));
	  //List<WebElement> allGoogleLinks = driver.findElement(By.cssSelector("a"));
	  System.out.println("No. of links on Google Home page are - " + allGoogleLinks.size());
	  for (WebElement oneLink : allGoogleLinks) {
		  System.out.println(oneLink.getText() + " - " + oneLink.getAttribute("href"));
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
