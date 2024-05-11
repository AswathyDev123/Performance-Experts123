package companyname.project_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExercize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.manage().window().maximize();

		driver.get("https://automationexercise.com/contact_us");

        driver.findElement(By.xpath("//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[1]/input[1]")).sendKeys("Aswathy");

	   driver.findElement(By.xpath("//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[2]/input[1]")).sendKeys("demo@gmail.com");
	   driver.findElement(By.xpath("//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[3]/input[1]")).sendKeys("Welcome");
	   driver.findElement(By.xpath("//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[6]/input[1]")).click();
	}

}
