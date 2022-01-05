package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class login_zerodha_password {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\prasad\\Desktop\\All Drives and jar files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String url = "https://www.facebook.com";
		driver.get(url);
		driver.navigate().to("https://www.google.com");
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("XA0123");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button")).click();
		//driver.close();
	}

}
