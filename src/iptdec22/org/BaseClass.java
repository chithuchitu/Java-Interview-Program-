package iptdec22.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;


 		
		public  static WebDriver broswerLaunch() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\TestProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;

 		}
 public void loadUrl( String url) {
 driver.get(url);
}
	

}
