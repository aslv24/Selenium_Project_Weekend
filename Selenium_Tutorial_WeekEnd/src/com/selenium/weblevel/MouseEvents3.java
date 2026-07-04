package com.selenium.weblevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents3 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automation-practice-theta.vercel.app/mouse");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.id("reset-drag-drop-button")).click();
		
		WebElement fromPlace = driver.findElement(By.id("drag-source-card"));
		
		WebElement toPlace = driver.findElement(By.id("drop-target-card"));
		
		act.dragAndDrop(fromPlace, toPlace).perform();
		
		

	}

}
