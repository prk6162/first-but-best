package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasad\\Desktop\\All Drives and jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://kite.zerodha.com");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[2]/input")).sendKeys("XA1234"); //for absolute xpath
		//driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("XA1234");  // for relative xpath
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[3]/input")).sendKeys("123456");// absolute xpath
		//driver.findElement(By.xpath("//input[@maxlength='6']")).sendKeys("123456") //for relative xpath
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();  //for relative xpath
		
	}

}
