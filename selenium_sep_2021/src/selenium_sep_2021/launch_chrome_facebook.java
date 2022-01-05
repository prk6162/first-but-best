package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome_facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasad\\Desktop\\All Drives and jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
		
		
		email.sendKeys("prasadkulkarni226511@gmail.com");
		Password.sendKeys("09876543210");
		LoginBtn.click();
		}

}
