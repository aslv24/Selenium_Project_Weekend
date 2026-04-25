package com.selenium.weblevel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement dropdownElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));

		Select sel=new Select(dropdownElement);
		
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		
		sel.selectByValue("BHR");
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("India");
		
		List<WebElement> alldropdown = sel.getOptions();
		
		System.out.println(alldropdown.size());
		
		for (WebElement aa : alldropdown) {
			System.out.println(aa.getText());
		}
		
	}

}
