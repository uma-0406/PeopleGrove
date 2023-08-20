package com.grove;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 
{
	
    public static void main( String[] args ) throws AWTException, InterruptedException
    {
    	  ChromeOptions opt = new ChromeOptions();
		  opt.addArguments("--remote-allow-origins=*");
    	  WebDriverManager.chromedriver().setup();    	  
          WebDriver driver = new ChromeDriver(opt);		
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
		  WebElement jobs=driver.findElement(By.xpath("//p[text()='Browse roles you have connections to']//parent::div"));
		  jobs.click();		 
		  WebElement job_Select=driver.findElement(By.xpath("//div[@class='ant-card-body']"));
		  job_Select.click();
		  WebElement question=driver.findElement(By.xpath("//div[@class='ctaContainer__totDE']//child::button[@type='button']"));
		  question.click();
		  JavascriptExecutor js=( JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  WebElement text=driver.findElement(By.xpath("//div[@class='fr-element fr-view']"));
		  text.sendKeys("XYZ");
		  WebElement send=driver.findElement(By.xpath("//div[@class='sendMessageBtn__NhCjS']//child::button[@type='button']"));
		  send.click();
		  WebElement keepConvo=driver.findElement(By.xpath("//div[@class='ctaContainer__totDE']//child::button[@type='button']"));
		  keepConvo.click();
		  WebElement inbox=driver.findElement(By.xpath("//div[@class='navListEl']//child::button[text()='Inbox']"));
		  inbox.click();		 
		  driver.close();	  
		     
		
    }
}
