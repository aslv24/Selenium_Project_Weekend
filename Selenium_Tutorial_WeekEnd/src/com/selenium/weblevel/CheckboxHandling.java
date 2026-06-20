package com.selenium.weblevel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automation-practice-theta.vercel.app/checkbox");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement checkboxElement = driver.findElement(By.id("accept-terms-checkbox"));
		
		boolean displayed = checkboxElement.isDisplayed();//true
		System.out.println("Is the checkbox displayed? " + displayed);
		
		boolean enabled = checkboxElement.isEnabled();//true
		System.out.println("Is the checkbox enabled? " + enabled);
		
		boolean selected = checkboxElement.isSelected();//false
		System.out.println("Is the checkbox selected? " + selected);
		
		if(displayed && enabled && !selected)
		{
		checkboxElement.click();
		}
		
		boolean afterSelected = checkboxElement.isSelected();//true
		System.out.println("After clicking the checkbox, is it selected? " + afterSelected);
		
		
	}

}
