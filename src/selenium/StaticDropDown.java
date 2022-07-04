package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Dropdown with select tag
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select Dropdown =new Select(staticdropdown);
		Dropdown.selectByIndex(3);
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.selectByVisibleText("AED");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.selectByValue("INR");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
	}

}
