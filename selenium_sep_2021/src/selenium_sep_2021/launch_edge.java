package selenium_sep_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launch_edge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\prasad\\Desktop\\All Drives and jar files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String url = "https://www.facebook.com";
		driver.get(url);
		driver.navigate().to("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}

}
