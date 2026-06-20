package com.selenium.weblevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumbase.io/demo_page");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement element = driver.findElement(By.id("myTextInput"));
		
		System.out.println("Is element displayed: " + element.isDisplayed());
		System.out.println("Is element enabled: " + element.isEnabled());
		System.out.println("Is element selected: " + element.isSelected());
		
		element.click();
		element.sendKeys("selenium webdriver");
		
		Thread.sleep(2000);
		
		element.clear();
		
		Thread.sleep(2000);
		element.sendKeys("selenium");
		System.out.println("Element id - "+element.getAttribute("id"));
		
		System.out.println("Typed Value - "+element.getAttribute("value"));
		
		System.out.println("Element text - "+element.getText());
		
		System.out.println("Element tag name - "+element.getTagName());
		
		System.out.println("Element location - "+element.getLocation());
		
		System.out.println("Element size - "+element.getSize());
		
		System.out.println("Element font Size - "+element.getCssValue("font-size"));
		
		System.out.println("Element css Style - "+element.getCssValue("font-style"));
		
		System.out.println("Element Color- "+element.getCssValue("color"));
		

	}

}
