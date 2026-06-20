package com.selenium.weblevel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are: " + links.size());
		
		for(WebElement aa:links)
		{
			System.out.println(aa.getText()+"----->"+aa.getAttribute("href"));
		}

	}

}
