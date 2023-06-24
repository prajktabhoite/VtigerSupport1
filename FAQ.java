package SUPPORT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FAQ {

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
		driver.findElement(By.xpath("//*[text()=' FAQ']")).click();	
		driver.findElement(By.id("Faq_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("Faq_editView_fieldName_product_id_create")).click();
		driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("PRODUCTNAME");
		driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("9635");
		driver.findElement(By.id("tax2_check")).click();
		driver.findElement(By.id("Products_editView_fieldName_qtyinstock")).sendKeys("7418");
		driver.findElement(By.id("Products_editView_fieldName_discontinued")).click();
		driver.findElement(By.id("tax1_check")).click();
		driver.findElement(By.id("tax3_check")).click();
	    WebElement ele1 = driver.findElement(By.xpath("//*[@name='assigned_user_id']"));
	    Select s1 = new Select(ele1);
	    s1.selectByValue("3");
	    
	
		driver.findElement(By.xpath("//*[@name='saveButton']")).click();
		
		 WebElement ele2 = driver.findElement(By.xpath("//*[@name='faqcategories']"));
		    Select s2 = new Select(ele2);
		    s2.selectByValue("General");
		    
		    driver.findElement(By.id("Faq_editView_fieldName_faq_answer")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation.");
	
		    WebElement ele3 = driver.findElement(By.xpath("//*[@name='faqstatus']"));
		    Select s3 = new Select(ele3);
		    s3.selectByValue("Published");
		    
		    
		    driver.findElement(By.id("Faq_editView_fieldName_question")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation.");

		    driver.findElement(By.xpath("//*[@class='btn btn-success saveButton']")).click();
		    Thread.sleep(200);	
			 driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
			 Thread.sleep(200);
			 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	
		    
	}

}
