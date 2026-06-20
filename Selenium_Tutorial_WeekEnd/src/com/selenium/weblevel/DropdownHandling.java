package com.selenium.weblevel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automation-practice-theta.vercel.app/dropdown");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement dropdownElement = driver.findElement(By.id("simple-course-dropdown"));
		
		Select select = new Select(dropdownElement);
		
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("playwright");
		Thread.sleep(2000);
		select.selectByVisibleText("Cypress");
		
		List<WebElement> allDropdownOptions = select.getOptions();
		
		System.out.println("Total dropdown options are: " + allDropdownOptions.size());
		
		for(WebElement aa:allDropdownOptions)
		{
			System.out.println(aa.getText());
		}
		
		
	}

}
