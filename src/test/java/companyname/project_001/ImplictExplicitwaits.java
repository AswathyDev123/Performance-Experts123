package companyname.project_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplictExplicitwaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dropdown");

		// implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//explict
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.visibilityOf(dropdown));
			
		}
catch(Exception e){
	e.printStackTrace();
}

	}

}
