package com.selenium.weblevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automation-practice-theta.vercel.app/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement element = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("singleFrame")).findElement(By.name("singleFrameInput"));
		element.sendKeys("184637");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.switchTo().defaultContent();
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("nestedParentFrame"));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("nestedChildFrame"));
		
		driver.findElement(By.name("nestedChildInput")).sendKeys("24423342342");
		
		driver.switchTo().parentFrame();
		
		String text = driver.findElement(By.id("parentFrameMessage")).getText();
		
		System.out.println(text);
		

	}

}
