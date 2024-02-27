package TestNG.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvokeFirefoxBrowser {

	@Test
	public void invokefirefox() {
		 System.setProperty("webdriver.Gecko.driver","C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.selenium.dev/");

	} 
	
}
