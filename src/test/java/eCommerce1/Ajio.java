package eCommerce1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajioTest() throws InterruptedException
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	  Thread.sleep(2000);
	  driver.close();
  }
}
