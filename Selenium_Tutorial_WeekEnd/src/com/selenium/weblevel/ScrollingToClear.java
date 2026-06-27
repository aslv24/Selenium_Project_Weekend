package com.selenium.weblevel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToClear {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		float a=10.0f;
		
		int b=(int)a; // Type casting from float to int converting one data type to another data type
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automation-practice-theta.vercel.app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement element = driver.findElement(By.xpath("/html/body/main/section[3]/nav/a[6]/div/span"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element); // Scroll to particular element
		
		js.executeScript("arguments[0].click();",element); // Scroll to click on particular element
		
		WebElement nameField = driver.findElement(By.id("practice-full-name"));
		
		js.executeScript("arguments[0].value=('Logeshwaran');",nameField); // Scroll to send keys to particular element
		
		js.executeScript("arguments[0].value=('');",nameField); //scroll to clear the value of particular element
	

	}

}
