package companyname.project_001;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dropdown");

		// implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));

		Select sel = new Select(dropdown);

		sel.selectByIndex(1);

		Thread.sleep(3000);

		sel.selectByVisibleText("Option 1");

		Thread.sleep(3000);

		sel.selectByValue("2");

	}

}
