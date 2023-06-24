package SUPPORT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ServiceContracts {

	public static void main(String[] args) throws InterruptedException {
		
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
		driver.findElement(By.xpath("//*[text()=' Service Contracts']")).click();	
		driver.findElement(By.id("ServiceContracts_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("ServiceContracts_editView_fieldName_subject")).sendKeys("Oliviya");
		
		WebElement ele1 = driver.findElement(By.cssSelector("*[name='assigned_user_id']"));
		Select s1 = new Select(ele1);
		s1.selectByValue("4");
		
		WebElement ele2 = driver.findElement(By.cssSelector("*[name='tracking_unit']"));
		Select s2 = new Select(ele2);
		s2.selectByValue("Hours");
		
		driver.findElement(By.id("ServiceContracts_editView_fieldName_total_units")).sendKeys("852");
		driver.findElement(By.id("ServiceContracts_editView_fieldName_used_units")).sendKeys("963");
		
		WebElement ele3 = driver.findElement(By.cssSelector("*[name='contract_priority']"));
		Select s3 = new Select(ele3);
		s3.selectByValue("Normal");
		
		WebElement ele4 = driver.findElement(By.cssSelector("*[class='select2 referenceModulesList select2-offscreen']"));
		Select s4 = new Select(ele4);
		s4.selectByValue("Accounts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ServiceContracts_editView_fieldName_sc_related_to_create']")).click();
		Thread.sleep(2000);
		
		 driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Oliviya");
		    driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("7418529633");
		    driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.abc.com");
		    
		    WebElement ele6 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		    Select s6 = new Select(ele6);
		    s6.selectByValue("4");
		    Thread.sleep(200);
		    driver.findElement(By.xpath("//*[@name='saveButton']")).click();


		    WebElement ele7 = driver.findElement(By.cssSelector("*[name='contract_type']"));
			Select s7 = new Select(ele7);
			s7.selectByValue("Support");
			
			driver.findElement(By.id("ServiceContracts_editView_fieldName_start_date")).click();
			driver.findElement(By.xpath("(//*[text()='Today'])[1]")).click();
			Thread.sleep(200);
			
			driver.findElement(By.id("ServiceContracts_editView_fieldName_due_date")).click();
			driver.findElement(By.xpath("/HTML/BODY/DIV[7]/DIV[1]/TABLE/TFOOT/TR[1]/TH")).click();
			
			
			
			 WebElement ele8 = driver.findElement(By.cssSelector("*[name='contract_status']"));
				Select s8 = new Select(ele8);
				s8.selectByValue("In Progress");
			
				 driver.findElement(By.xpath("//*[@class='btn btn-success saveButton']")).click();
				    Thread.sleep(200);	
					 driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
					 Thread.sleep(200);
					 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
			
			

	}

}
