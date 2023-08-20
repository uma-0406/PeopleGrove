package com.grove;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
	 public static void main( String[] args ) throws AWTException, InterruptedException
	 {
    	 
    	  WebDriverManager.chromedriver().setup();    	  
          WebDriver driver = new ChromeDriver();		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://basecopy5.staging.pg-test.com/hub/newhub503949860203/home-v3");		  
		  WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		  email.sendKeys("umatvr@gmail.com");
		  WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));			  
		  pass.sendKeys("@Sachin2012");
		  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		  login.click();
		  WebElement careers = driver.findElement(By.xpath("//div[@class='navListEl']//child::button[@class='overflow-ellipsis navItemTitle' and @aria-label='Career']"));
		  Actions a=new Actions(driver);
		  a.moveToElement(careers).build().perform();  
		  JavascriptExecutor js=( JavascriptExecutor )driver;
		  js.executeScript("arguments[0].scrollIntoView()",careers);
		  WebElement c1=driver.findElement(By.xpath("//div[@class='career-card__title' and text()='Search Marketing Strategists']"));
		  c1.click();			  
		  List<String> career_Options=new ArrayList<String>();
		  career_Options.add("Search Marketing Strategists");
		  career_Options.add("Data Scientists");
		  career_Options.add("Technical Writers");
		  for(String option:career_Options)
		  {
		    System.out.println(option);
		  }	 			  		  
	  }			   		
}

