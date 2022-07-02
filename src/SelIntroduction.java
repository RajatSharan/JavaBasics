import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * // Invoking Browser // Chrome -ChromeDriver -> Methods // Same method should
		 * be in firefox so we only need to create object then that methods will be run
		 * // Webdriver Method + internal class methods
		 */		
		
		
		
		
		/*
		 * //ChromerDriver.exe -> Chrome Browser //ChromerDriver.exe with this file
		 * selenium invoking Chrome browser and ChromerDriver.exe file internally do
		 * something and invoke the browser //Selenium using key value
		 * webdriver.chrome.driver ->value path
		 */	
		
		
		
		//Chrome Driver
		
		//System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		
		//Firefox driver Launch
		
		//System.setProperty("webdriver.gecko.driver", "D:\\FireFoxDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		
		//Edge Driver Launch
		
		System.setProperty("webdriver.edge.driver", "D:\\EdgeBrowser Driver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		
		
		driver.get("https://rahulshettyacademy.com/#/inbox");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();		
		
		
		

	}

}
