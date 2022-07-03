package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name="Rahul";
//		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "D:\\FireFoxDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		WebDriver driver =new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "D:\\EdgeBrowser Driver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//Globally wait for each and every field
		String password= getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);//Identify with partial text also
		 driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		 driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		 Thread.sleep(2000);
		 System.out.println(driver.findElement(By.tagName("p")).getText());
		 Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		//driver.findElement(By.cssSelector("button[class='logout-btn']")).click();
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		 String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		String [] passwordArray= passwordText.split("'");
		String password=passwordArray[1].split("'")[0];
		return password;
		
		
		
		
		
	}

}
