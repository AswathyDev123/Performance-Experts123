package companyname.project_001;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
	
	
	
	}

}
