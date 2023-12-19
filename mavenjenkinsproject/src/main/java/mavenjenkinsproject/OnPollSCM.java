package mavenjenkinsproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OnPollSCM {
	@Test
	public void onPoll() {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("navigated successfully",true);
		
	}

}
