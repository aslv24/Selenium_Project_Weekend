package com.selenium.weblevel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		
		float a=10.0f;
		
		int b=(int)a; // Type casting from float to int converting one data type to another data type
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automation-practice-theta.vercel.app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		File destination = new File("C:\\Users\\INFOMATS ADMIN\\Desktop\\screenshot\\screenshot.png");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(screenshotAs, destination);
	

	}

}
