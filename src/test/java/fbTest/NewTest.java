package fbTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.Assert;
 
 
public class NewTest {
  @Test
  public void f() throws MalformedURLException, InterruptedException {
		WebDriver driver;
		DesiredCapabilities caps = DesiredCapabilities.firefox();
	    caps.setCapability("platform", "Windows 7");
	    caps.setCapability("version", "36.0");
	 
	    driver = new RemoteWebDriver(new URL("http://testSauce55:349bc767-3426-411a-9e26-19c3185223fa@ondemand.saucelabs.com:4444/wd/hub"), caps);
 	 //driver.get("https://google.com/");
 	 driver.get("https://www.facebook.com/");
 	 String getTitle=driver.getTitle();
 	 System.out.println(getTitle);
 	 Thread.sleep(10000);
	driver.manage().window().maximize();
	driver.close();
  }

}
