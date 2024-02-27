package TestNG.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {
	@Test
	@Parameters("browser")
	public void parameterisedtest(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.selenium.dev/");
		}

		else {
			{
				System.setProperty("webdriver.Gecko.driver",
						"C:\\Users\\athar\\OneDrive\\Documents\\Manipal\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.selenium.dev/");
			}
		}
	}
}
