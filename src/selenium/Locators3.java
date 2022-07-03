package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//Sibling-child to Parent traverse
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Absolute xpath: when you finding the element from the root.
		//Relative xpath : Your are directly jump on middle of DOM
		
		//header/div/button[1]/following-sibling::button[1]
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
		
	}

}
