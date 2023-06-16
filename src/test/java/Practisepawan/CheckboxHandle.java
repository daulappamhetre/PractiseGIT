package Practisepawan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxHandle
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	/*	System.out.println("total no of check boxes:"+checkboxes.size());
		/*  for (WebElement we : checkboxes) 
		{
			we. click();
			
		}*/
		
	/*	for (WebElement we : checkboxes) 
		{
			String checkbo = we.getAttribute("id");
			if(checkbo.equals("monday")|| checkbo.equals("sunday"));
			{
				we.click();
			}*/
	
		 		
			
		int totalchekboxes=checkboxes.size();
		/*for(int i=totalchekboxes-2;i<totalchekboxes;i++)
		{
			checkboxes.get(i).click();
		}*/
		
		for(int i=0;i<totalchekboxes;i++)
		{
			if(i<2)
			{
				
			
			checkboxes.get(i).click();
			
		}
		
		
		
		 
		
		
		
	}

}
}
  
