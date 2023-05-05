package FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass {
	
	@Test
	public void firstClass()
	{
		String headerText="";
		String descriptionText="";
		String linkText="";
		
		String txt1="",txt2="";
		
		String actualTitle ="";
		String expectedTitle="";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Navigating to Google.com");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Searching text - \"automation testing tools\" ");
		driver.findElement(By.id("APjFqb")).sendKeys("automation testing tools");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='hXfKwd'])[1]")).click();
		headerText = driver.findElement(By.xpath("//aside[@data-id='5fd0a7be']/div")).getText();
		System.out.println("Tool Name " + headerText);
		
		descriptionText = driver.findElement(By.xpath("(//div[@jscontroller='GCSbhd'])[1]/div/span")).getText();
		System.out.println("Tool Description " + descriptionText);
		
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='github.com']")).isDisplayed()));
		driver.findElement(By.xpath("(//span[@class='S5XGBe'])[1]")).click();
	
		driver.findElement(By.xpath("//div[@jsname='vbgB1c']")).click();
		txt1= driver.findElement(By.xpath("(//span[@class='s2ZLHc'])[1]")).getText();
		txt2 =driver.findElement(By.xpath("(//span[@class='s2ZLHc'])[1]")).getText();
		linkText= txt1+txt2;
		System.out.println("Link  " + linkText);
		driver.findElement(By.xpath("(//span[@class='s2ZLHc'])[1]")).click();
		expectedTitle="Top 15 list of automation testing tools | Latest Update in 2023";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("(//div[@class='hXfKwd'])[2]")).click();
		headerText = driver.findElement(By.xpath("//aside[@data-id='2c79fe7a']/div")).getText();
		System.out.println("Tool Name " + headerText);
		descriptionText = driver.findElement(By.xpath("(//div[@jscontroller='GCSbhd'])[3]/div/span")).getText();
		System.out.println("Tool Description " + descriptionText);
		
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='commons.wikimedia.org']")).isDisplayed()));
		driver.findElement(By.xpath("//*[text()='commons.wikimedia.org']")).click();
		
		driver.findElement(By.xpath("//div[@jsname='vbgB1c']")).click();
		txt1= driver.findElement(By.xpath("(//span[@class='s2ZLHc'])[5]")).getText();
		txt2 =driver.findElement(By.xpath("(//span[@class='s2ZLHc'])[6]")).getText();
		linkText= txt1+txt2;
		System.out.println("Link Description " + linkText);
		driver.findElement(By.xpath("(//span[@class='s2ZLHc'])[5]")).click();
		expectedTitle="Top 15 list of automation testing tools | Latest Update in 2023";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.navigate().back();
		
		driver.quit();
		
	}
	

}
