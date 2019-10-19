package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGIN_TEST {
	private static Object fn12;
	private static Object submit;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://newtours.demoaut.com/");
WebElement reg=driver.findElement(By.linkText("REGISTER"));
reg.click();
WebElement fn=driver.findElement(By.name("firstName"));
fn.sendKeys("vivek");
WebElement fn1=driver.findElement(By.name("lastName"));
fn1.sendKeys("pachange");
WebElement fn2=driver.findElement(By.name("phone"));
fn2.sendKeys("8796232176");
WebElement fn3=driver.findElement(By.id("userName"));
fn3.sendKeys("vivekpachange1@gmail.com");
WebElement fn4=driver.findElement(By.name("address1"));
fn4.sendKeys("flat no.5 sai vishwas complex devkar park 60 feet rd pimple pune-411061");
WebElement fn5=driver.findElement(By.name("city"));
fn5.sendKeys("pune");
WebElement fn6=driver.findElement(By.name("state"));
fn6.sendKeys("maharastra");
WebElement fn7=driver.findElement(By.name("postalCode"));
fn7.sendKeys("411061");
WebElement fn8=driver.findElement(By.name("country"));
fn8.sendKeys("INDIA");
WebElement fn9=driver.findElement(By.name("email"));
fn9.sendKeys("vivekpachange1@gmail.com");
WebElement fn10=driver.findElement(By.name("password"));
fn10.sendKeys("Vivpac@46");
WebElement fn11=driver.findElement(By.name("confirmPassword"));
fn11.sendKeys("Vivpac@46");
WebElement fn12=driver.findElement(By.name("register"));
fn12.click();
driver.manage().window().maximize();
Thread.sleep(50000);
driver.close();
}

}
