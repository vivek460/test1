package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TRylogin {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement fn=driver.findElement(By.name("Search"));
		fn.sendKeys("IT");
		WebElement fn1=driver.findElement(By.name("Search"));
		fn1.click();
		Thread.sleep(5000);
		driver.close();

		
	}

}
