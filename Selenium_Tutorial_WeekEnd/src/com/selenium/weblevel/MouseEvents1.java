package com.selenium.weblevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement jobsIcon = driver.findElement(By.xpath("//span[text()='Jobs']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(jobsIcon).perform();
		
		WebElement jobsInDelhi = driver.findElement(By.xpath("//div[text()='Jobs in Delhi']"));
		
		act.click(jobsInDelhi).perform();

	}

}
