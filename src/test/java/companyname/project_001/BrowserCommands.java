package companyname.project_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/");

		// titile

		String title = driver.getTitle();

		System.out.println(title);

		// get page source

		String pgsrce = driver.getPageSource();
		System.out.println(pgsrce);

		// get current url

		String curnturl = driver.getCurrentUrl();
		System.out.println(curnturl);

		// driver.close---closes the current url

		driver.close();

	}

}
