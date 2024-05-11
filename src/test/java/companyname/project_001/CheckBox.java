package companyname.project_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/checkboxes");

		Thread.sleep(1000);

		WebElement checkbox2 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[2]"));

		if (checkbox2.isDisplayed()) {
			checkbox2.click();

		} else {
			System.out.println("Checkbox2 is not displayed");

		}

		Thread.sleep(1000);

		WebElement checkbox1 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[1]"));

		if (checkbox1.isDisplayed()) {
			checkbox1.click();

		} else {
			System.out.println("Checkbox 1 is not displayed");

		}

	}

}
