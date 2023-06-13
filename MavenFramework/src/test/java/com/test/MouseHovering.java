package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHovering {

	@Test
	 public void MouseHoveringConcept()throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		driver.manage().window().maximize(); //Maximize the window
		
		System.out.println(driver.getTitle());
		
		
	WebElement Accountlist = 	driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(Accountlist).perform();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Account']")).click();

	}

}
