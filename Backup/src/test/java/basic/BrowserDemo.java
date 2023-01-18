package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserDemo {
	public static void main(String[] args) {
		
		//chrome
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\latest_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//firefox
		//System.setProperty("webdriver.gecko.driver", "D:\\BrowserDriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		//WebDriver driver = new InternetExplorerDriver();
		//new SafariDriver();
		
		
	}
}
