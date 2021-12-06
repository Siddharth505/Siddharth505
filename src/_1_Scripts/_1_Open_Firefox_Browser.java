package _1_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class _1_Open_Firefox_Browser {
	
	@Test
	public void OpenBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Siddharth\\eclipse-workspace\\Firefox_Browser\\drivers\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		System.out.println(driver.getTitle());
	}

}
