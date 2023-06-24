package SUPPORT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SMSNotifier {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();	
		driver.findElement(By.id("appnavigator")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//span[text()=' SUPPORT']")).click();	
		Thread.sleep(200);
		driver.findElement(By.xpath("(//*[text()=' SMS Notifier'])[2]")).click();	
		driver.findElement(By.id("createFilter")).click();
		
		driver.findElement(By.cssSelector("*[name='viewname']")).sendKeys("Account1");
		 Thread.sleep(200);
		 driver.findElement(By.cssSelector("*[name='setdefault']")).click();
		 Thread.sleep(200);
		 driver.findElement(By.cssSelector("*[name='setmetrics']")).click();
		 Thread.sleep(2000);
		
		 WebElement ele1 = driver.findElement(By.cssSelector("*[name='selectColumns']"));
		 Select s1 = new Select(ele1);
		 s1.selectByVisibleText("Created Time");
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='fa fa-plus'])[1]")).click();
				 
		 WebElement e1 = driver.findElement(By.xpath("(//*[@name='columnname'])[1]"));
		 Select s2 = new Select(e1);
		 Thread.sleep(1000);
		 s2.selectByVisibleText("Created Time");
		 
		 WebElement ele2 = driver.findElement(By.xpath("(//*[@name='comparator'])[1]"));
		 Select s3 = new Select(ele2);
		 Thread.sleep(1000);
		 s3.selectByVisibleText("equals");
		 
		 driver.findElement(By.xpath("(//*[@class='input-group-addon'])[1]")).click();
		 driver.findElement(By.xpath("(//*[contains(text(),'Today')])[2]")).click();
		 		 
		 driver.findElement(By.xpath("(//*[@class='fa fa-plus'])[2]")).click();
		 
		 WebElement e11 = driver.findElement(By.xpath("(//*[@name='columnname'])[3]"));
		 Select s21 = new Select(e11);
		 Thread.sleep(1000);
		 s21.selectByVisibleText("Assigned To");
		 		 
		 WebElement ele21 = driver.findElement(By.xpath("(//*[@name='comparator'])[3]"));
		 Select s31 = new Select(ele21);
		 Thread.sleep(1000);
		 s31.selectByVisibleText("equals");
		 		 
		 WebElement el21 = driver.findElement(By.xpath("//*[@class='select2 inputElement row-fluid ignore-validation select2-offscreen']"));
		 Select S31 = new Select(el21);
		 Thread.sleep(1000);
		 S31.selectByVisibleText("Marketing Group");
		 		 
		 JavascriptExecutor j3 = (JavascriptExecutor)driver;
		 j3.executeScript("window.scrollBy(0,300)");
		 
		 driver.findElement(By.cssSelector("*[class='btn btn-success saveButton']")).click();
			
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
			Thread.sleep(200);
			driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
