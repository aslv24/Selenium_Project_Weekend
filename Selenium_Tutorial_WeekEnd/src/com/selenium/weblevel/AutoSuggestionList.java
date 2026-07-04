package com.selenium.weblevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionList {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		
		driver.findElement(By.cssSelector("div.countryCodeText")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		List<WebElement> countries = driver.findElements(By.cssSelector("div#country_id>ul>li"));
		
		System.out.println("Total countries are: "+countries.size());
		
		for (WebElement aa : countries) {
			System.out.println(aa.getText());
		}
		
		for (WebElement aa : countries) {
			String text = aa.getText();
			if(text.endsWith("+62)"))
			{
				aa.click();
				break;
			}
		}
		

	}

}
