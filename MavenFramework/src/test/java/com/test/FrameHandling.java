package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FrameHandling {

	@Test
	public void Frames() throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://yatra.com");
		
		driver.manage().window().maximize(); //Maximize the window
		
		System.out.println(driver.getTitle());
		
		
	WebElement support = 	driver.findElement(By.xpath("//a[text()='Support ']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(support).perform();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Talk To Us']")).click();
	
	driver.switchTo().frame("iframeChatBot"); //user is inside into the frame
	
	driver.findElement(By.xpath("//button[text()='Cancellation']")).click();
	
	driver.switchTo().defaultContent(); //come out from the frame
	
	driver.findElement(By.id("chatbot_close_button")).click();

	}

}
