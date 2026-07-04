package com.selenium.weblevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automation-practice-theta.vercel.app/mouse");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Actions act=new Actions(driver);
		
		WebElement rightClickButton = driver.findElement(By.name("rightClick"));
		
		WebElement doubleClickButton = driver.findElement(By.name("doubleClick"));
		
		act.contextClick(rightClickButton).perform();
		
		act.doubleClick(doubleClickButton).perform();
		
		

	}

}
