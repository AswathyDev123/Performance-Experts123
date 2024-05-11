package companyname.project_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\user\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  // script level - applicabel to all the elements in the script
		  
		  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		  
		  Actions act = new Actions(driver);
		  
		  Actions seriesofactions = act.click(email).keyDown(email,Keys.SHIFT).sendKeys("hello");
		  
		  seriesofactions.build().perform();
		

	}

}
