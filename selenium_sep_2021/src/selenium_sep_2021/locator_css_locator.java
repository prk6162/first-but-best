package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_css_locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasad\\Desktop\\All Drives and jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy"));
		// WebElement username = driver.findElement(By.cssSelector("input[id=\"email\"]"));  it is also used
		// WebElement username = driver.findElement(By.cssSelector("input#email[name='email']"));  it is also used
		// WebElement username = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[data-testid='royal_email']"));  it is also used
		// WebElement username = driver.findElement(By.cssSelector("div>input[name='email']");   it is also used
		// WebElement username = driver.findElement(By.cssSelector("div>input");   it is also used
		WebElement Password = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
		// WebElement Password = driver.findElement(By.cssSelector("input[name=\"pass\"]"));   it is also used
		// WebElement Password = driver.findElement(By.cssSelector("input#pass[data-testid='royal_pass']"));   it is also used
		// WebElement Password = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[placeholder='Password']"));   it is also used
		WebElement LoginBtn = driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"));
			username.sendKeys("pashya226511@gmail.com");
			Password.sendKeys("Prkul@6162");
		//WebElement forgottenBtn =driver.findElement(By.cssSelector("a[data-testid=\"open-registration-form-button\"]"));   for forgotten password
		//WebElement CreatenewAc =driver.findElement(By.cssSelector("a[class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));   for create new account
			LoginBtn.click();
		
	}

}
