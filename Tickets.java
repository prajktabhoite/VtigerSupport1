package SUPPORT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Tickets {

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
		driver.findElement(By.xpath("//*[text()=' Tickets']")).click();	
		driver.findElement(By.id("HelpDesk_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("HelpDesk_editView_fieldName_ticket_title")).sendKeys("TICKET");
		driver.findElement(By.id("HelpDesk_editView_fieldName_contact_id_create")).click();
		Thread.sleep(2000);
	    WebElement ele3 = driver.findElement(By.xpath("//*[@name='salutationtype']"));
	    Select s3 = new Select(ele3);
	    s3.selectByValue("Prof.");
	    
	    driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("NAME");
	    driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("7417418528");
	    driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("abc@gmail.com");
	    driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("OKO");
	    driver.findElement(By.id("account_id_display")).sendKeys("ABC");
	    
	    WebElement ele4 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
	    Select s4 = new Select(ele4);
	    s4.selectByValue("4");
	    driver.findElement(By.xpath("//*[@name='saveButton']")).click();
	    
	    driver.findElement(By.id("HelpDesk_editView_fieldName_product_id_create")).click();
	    
	    driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("PRODUCTNAME");
		driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("9635");
		driver.findElement(By.id("tax2_check")).click();
		driver.findElement(By.id("Products_editView_fieldName_qtyinstock")).sendKeys("7418");
		driver.findElement(By.id("Products_editView_fieldName_discontinued")).click();
		driver.findElement(By.id("tax1_check")).click();
		driver.findElement(By.id("tax3_check")).click();
	    WebElement ele1 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
	    Select s1 = new Select(ele1);
	    s1.selectByValue("4");
	    
	
		driver.findElement(By.xpath("//*[@name='saveButton']")).click();
		
		WebElement ele11 = driver.findElement(By.xpath("//*[@name='ticketstatus']"));
	    Select s11 = new Select(ele11);
	    s11.selectByValue("In Progress");
	    
	    driver.findElement(By.id("HelpDesk_editView_fieldName_hours")).sendKeys("55");
	    driver.findElement(By.id("HelpDesk_editView_fieldName_days")).sendKeys("15");
	    
	    driver.findElement(By.id("HelpDesk_editView_fieldName_parent_id_create")).click();
	    
	    driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Oliviya");
	    driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("7418529633");
	    driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.abc.com");
	    
	    WebElement ele6 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
	    Select s6 = new Select(ele6);
	    s6.selectByValue("4");
	    Thread.sleep(200);
	    
	    driver.findElement(By.xpath("//*[@name='saveButton']")).click();
	   
	    WebElement ele61 = driver.findElement(By.xpath("//*[@name='assigned_user_id']"));
	    Select s61 = new Select(ele61);
	    s61.selectByValue("4");
	    
	    WebElement ele611 = driver.findElement(By.xpath("//*[@name='ticketpriorities']"));
	    Select s611 = new Select(ele611);
	    s611.selectByValue("Normal");
	    
	    WebElement e1 = driver.findElement(By.xpath("//*[@name='ticketseverities']"));
	    Select a1 = new Select(e1);
	    a1.selectByValue("Critical");
	    
	    WebElement e11 = driver.findElement(By.xpath("//*[@name='ticketcategories']"));
	    Select a11 = new Select(e11);
	    a11.selectByValue("Small Problem");
	    
	    
	    JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    js1.executeScript("window.scrollBy(0,200)", "");
	    
	    driver.findElement(By.id("HelpDesk_editView_fieldName_description")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation.");
		
	    driver.findElement(By.id("HelpDesk_editView_fieldName_solution")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation.");
		
	    driver.findElement(By.xpath("//*[@class='btn btn-success saveButton']")).click();
	    Thread.sleep(200);	
		 driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
		 Thread.sleep(200);
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();

	    
	}

}
