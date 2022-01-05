package selenium_sep_2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasad\\Desktop\\All Drives and jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement createAC = driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
		
		createAC.click();
		//Thread.sleep(2000);
		
		WebElement Firstname = driver.findElement(By.cssSelector("input[name=''firstname]"));
		
		Firstname.sendKeys("Prasad");
}
}