package com.selenium.weblevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement fullnameField = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
		fullnameField.sendKeys("admin");
		

	}

}
