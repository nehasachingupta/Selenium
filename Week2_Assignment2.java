package week3.day1;
/*
  Assignment 2:Edit Lead
		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  2. Enter UserName and Password Using Id Locator
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Select State/Province as NewYork Using Visible Text
		  15. Click on Create Button
                  16. Click on edit button
                  17. Clear the Description Field using .clear()
		  18. Fill ImportantNote Field with Any text
		  19. Click on update button 
		  20. Get the Title of Resulting Page. refer the video  using driver.getTitle

 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week2_Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	    Thread.sleep(2000);
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	   driver.findElement(By.className("decorativeSubmit")).click();	   
	   driver.findElement(By.partialLinkText("CRM")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Create Lead")).click();
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Unishire Terreza");
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Neha");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
	   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("xyz");
	   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
	   driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenuim for Automation,web browser based tool");
	   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("apj.neha@gmail.com");
	   WebElement sourceId= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	   Select sec = new Select(sourceId);
	   sec.selectByVisibleText("Arizona");
	   driver.findElement(By.name("submitButton")).click();
	   driver.findElement(By.linkText("Edit")).click();	   
	   driver.findElement(By.id("updateLeadForm_description")).clear();
	   driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenuim for Automation,web browser based tool");	   
	   WebElement e = driver. findElement(By.className("smallSubmit"));
	   e.click();	   
	   driver.get("http://leaftaps.com/crmsfa/control/viewLead?partyId=14219");
	   String title1 = driver.getTitle();
	   System.out.println(title1);
	   
	}

}
