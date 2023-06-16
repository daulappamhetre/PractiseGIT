package Practisepawan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.id("justAnInputBox")).click();
	}

public static void selectChoiceValues(WebDriver driver,String... value)
{
	List<WebElement> choiselist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	if(value[0].equalsIgnoreCase("all"))
	{
		
		for(WebElement item:choiselist)
		{
			   String text = item.getText();
		}
for(String val:value)	
{
	
	
	
		
			
		}
		
	
		
		
		
	}
	
	
		  
		  
		  
		
		  
		
		
		
		
		
		
	}

}
