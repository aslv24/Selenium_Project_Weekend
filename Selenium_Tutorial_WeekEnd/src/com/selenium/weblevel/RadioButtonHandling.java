package com.selenium.weblevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement maleRadioButton = driver.findElement(By.id("gender"));
		
		System.out.println(maleRadioButton.isDisplayed());//true
		
		System.out.println(maleRadioButton.isEnabled());//true
		
		System.out.println(maleRadioButton.isSelected());//false
		
		maleRadioButton.click();
		
		System.out.println(maleRadioButton.isSelected());//true
		

	}

}
