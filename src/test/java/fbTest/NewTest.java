package fbTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 
public class NewTest {
  @Test
  public void f() {
		WebDriver driver;

	  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Resource\\geckodriver.exe");
 	 driver = new FirefoxDriver();
 

	driver.navigate().to("http://toolsqa.com/java/maven/create-new-maven-project-eclipse/");
  }
}
