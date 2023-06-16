package Practisepawan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigate 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement emailoutbox = driver.findElement(By.id("Email"));
		

System.out.println( emailoutbox.getAttribute("value "));


WebElement password = driver.findElement(By.id("Password"));
System.out.println(password.getAttribute("value"));
WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
System.out.println(login.getAttribute("value"));
 



		
		 
		
	}
	

} 
