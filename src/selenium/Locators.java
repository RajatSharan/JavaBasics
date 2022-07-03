package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   //Implicit Wait		
	   //Introducing Class name and Css Selector locators to identify elements
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Globally wait for each and every field
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rajat");
		driver.findElement(By.name("inputPassword")).sendKeys("Rajat");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Forgot Password Functionality
		
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rajat");
		 driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("errajatsharan@gmail.com");
		//Building Customized Xpath and Css Selector locators based on html attributes
		 driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		 driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("errajatsharan@gmail.com");
		 //driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8692985111");
		  driver.findElement(By.xpath("//form/input[3]")).sendKeys("8692985111");//Parent to Child Concept
		 driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		 System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		 driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		 
		 //Login Functionality 
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//Identify with partial text also
		 driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		 driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		 	
		 
		 
		 
		 
		 
		 

		
		
		

	}

}
