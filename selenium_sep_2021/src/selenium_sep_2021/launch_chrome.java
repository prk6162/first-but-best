package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class launch_chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasad\\Desktop\\All Drives and jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String ZerodhaURL ="https://kite.zerodha.com";
		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("XA0123");
	}

}
