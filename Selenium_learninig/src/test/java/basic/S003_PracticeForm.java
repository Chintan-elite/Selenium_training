package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnction;

public class S003_PracticeForm {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnction.getconnection("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("userEmail")).sendKeys("test");
		
//		List<WebElement> gender = driver.findElements(By.name("gender"));
//		System.out.println(gender.size());
//		gender.get(1).click();
		
		//driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label")).click();
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	}
}
