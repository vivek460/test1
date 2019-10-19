package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertionclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		HomePage hp=new HomePage(driver);
		
		
		
	}
	
	

}
