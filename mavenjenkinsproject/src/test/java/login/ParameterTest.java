package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterTest {
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		String BROWSER = System.getProperty("Url");
		driver.get(BROWSER);
		
	}

}
