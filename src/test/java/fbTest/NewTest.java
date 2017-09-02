package fbTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 
public class NewTest {
  @Test
  public void f() {
		WebDriver driver;

 	 driver = new FirefoxDriver();
	driver.get("https://google.com/");
	driver.manage().window().maximize();
	driver.close();
  }
}
