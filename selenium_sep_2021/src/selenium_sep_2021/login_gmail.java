package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class login_gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\prasad\\Desktop\\All Drives and jar files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("prasadkulkarni226511@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		
	}

	}

