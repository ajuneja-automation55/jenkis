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
	 
	    driver = new RemoteWebDriver(new URL("http://Anup91:39dc3a58-3fb9-4ebb-9601-f369db00197c@ondemand.saucelabs.com:4444/wd/hub"), caps);
 	 driver.get("https://google.com/");
 	 driver.get("http://www.rediff.com/");
 	 String getTitle=driver.getTitle();
 	 System.out.println(getTitle);
 	 Thread.sleep(10000);
	driver.manage().window().maximize();
	driver.close();
  }

}
