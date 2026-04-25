package com.selenium.weblevel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		
		List<WebElement> divTag = driver.findElements(By.tagName("div"));
		
		List<WebElement> buttonTag = driver.findElements(By.tagName("button"));
		
		System.out.println(aTag.size());
		
		System.out.println(divTag.size());
		
		System.out.println(buttonTag.size());
		
		}

}
