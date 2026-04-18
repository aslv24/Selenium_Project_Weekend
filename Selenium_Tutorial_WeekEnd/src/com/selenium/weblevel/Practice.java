package com.selenium.weblevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement firstnameField = driver.findElement(By.id("name"));
		firstnameField.sendKeys("vicky");
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("vicky@mail.com");
		
		WebElement maleRadioButton = driver.findElement(By.id("gender"));
		maleRadioButton.click();
		
		emailField.clear();

	}

}
