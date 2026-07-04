package com.selenium.weblevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for (WebElement aa : tableRows) {
			
			List<WebElement> tableColumns = aa.findElements(By.tagName("td"));
			for(WebElement bb :tableColumns)
			{
			System.out.print(bb.getText()+"|");
			}
			
			System.out.println();
		}
		

	}

}
