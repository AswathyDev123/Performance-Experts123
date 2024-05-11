package companyname.project_001;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		// Thread.sleep(1000);

		WebElement simplealert = driver
				.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));

		simplealert.click();

		Alert alt = driver.switchTo().alert();

		// clickin ok butt

		alt.accept();
		Thread.sleep(4000);

		// confirmation alert

		WebElement confirmtonalert = driver.findElement(By.xpath("//input[@name='confirmation']"));

		confirmtonalert.click();
		Thread.sleep(4000);

		Alert alt1 = driver.switchTo().alert();

		// clicking dismiss butoon

		alt1.dismiss();
		Thread.sleep(4000);

		// prompt alert

		WebElement promptalert = driver.findElement(By.xpath("//input[@name='prompt']"));

		promptalert.click();

		Alert alt2 = driver.switchTo().alert();

		// clicking dismiss butoon

		alt2.sendKeys("Aswathy");

		Thread.sleep(4000);

	}

}
