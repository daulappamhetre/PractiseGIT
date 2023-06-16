import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromestart 
{
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register");
	WebElement search = driver.findElement(By.xpath("( //input[@type='text'])[1]"));
	System.out.println("Display status:"+search.isDisplayed());
	System.out.println("Enabled status :"+search.isEnabled());
	WebElement male = driver.findElement(By.xpath("//span[@class='male']"));
	WebElement female = driver.findElement(By.xpath("//span[@class='female']"));
	      System.out.println(male.isSelected());
	      System.out.println(female.isSelected());
	      
	      
	      male.click();
	      System.out.println(male.isSelected());
	      System.out.println(female.isSelected());
	      female.click();
	      System.out.println(male.isSelected());
	      System.out.println(female.isSelected());
	      
	      
	
	 
	 
	
	
	
	
	
	//
	
	
  	

}
}