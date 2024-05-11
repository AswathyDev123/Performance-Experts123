package companyname.project_001;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\user\\Documents\\Drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");

		WebDriver driver =new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");

	}

}
