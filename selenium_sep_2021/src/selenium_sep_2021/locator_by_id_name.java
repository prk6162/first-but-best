package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_by_id_name {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasad\\Desktop\\All Drives and jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("prasadkulkarni226511@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Prkul@6162");
		driver.findElement(By.name("login")).click();
		
	}

}
