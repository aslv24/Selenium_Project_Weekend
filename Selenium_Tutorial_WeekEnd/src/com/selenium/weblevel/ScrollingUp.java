package com.selenium.weblevel;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUp {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		
		float a=10.0f;
		
		int b=(int)a; // Type casting from float to int converting one data type to another data type
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automation-practice-theta.vercel.app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); // Scroll down by 1000 pixels
		
		Thread.sleep(2000); // Wait for 2 seconds before scrolling up
		
		js.executeScript("window.scrollBy(0,-700)"); // Scroll up by 700 pixels
	

	}

}
