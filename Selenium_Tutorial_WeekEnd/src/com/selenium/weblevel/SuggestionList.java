package com.selenium.weblevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionList {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		
		WebElement fromPlace = driver.findElement(By.cssSelector("input#srcinput"));
		fromPlace.sendKeys("Chennai");
		
		List<WebElement> places = driver.findElements(By.cssSelector("div[class^='searchCategory']:first-of-type>div[class*='listItem']>div:first-of-type>div:first-of-type>div:first-of-type"));
		
		System.out.println("Total countries are: "+places.size());
		
		for (WebElement aa : places) {
			System.out.println(aa.getText());
		}
		
		for (WebElement aa : places) {
			String text = aa.getText();
			if(text.toLowerCase().contains("tambaram"))
			{
				aa.click();
				break;
			}
		}
		

	}

}
