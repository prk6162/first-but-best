package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasad\\Desktop\\All Drives and jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.cssSelector("input#email"));
		WebElement Password = driver.findElement(By.cssSelector("input#pass"));
		
	}

}
