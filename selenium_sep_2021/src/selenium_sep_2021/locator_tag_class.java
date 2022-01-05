package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_tag_class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasad\\Desktop\\All Drives and jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/selenium-tutorial");
		driver.findElement(By.className("gsc-input"));
		
	}

}
