package iptdec22.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice  extends BaseClass{
	public static WebDriver driver;

	private static void action() {
		broswerLaunch();
		
 		driver.manage().window().maximize();
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(courses).perform();
		WebElement oracleTraining = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		a.moveToElement(oracleTraining).perform();
		WebElement oracleDbaTraining = driver.findElement(By.xpath("//span[text()='Oracle DBA Training']"));
		oracleDbaTraining.click();	
		
	}
	private static  void dragAndDrop() {
		broswerLaunch();
 		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement drop = driver.findElement(By.xpath("//ol[@id='amt8']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();

	}
	public static void main(String[] args) {
		//action();
		//dragAndDrop();

	}





}
