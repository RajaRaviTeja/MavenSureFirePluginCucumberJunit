package com.qa.stepdef;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

 

public class FramesTest  extends BaseTest{

	BaseTest baseTest;
	WebDriver driverr;
	public FramesTest(BaseTest baseTest){
		this.baseTest=baseTest;
		this.driver=baseTest.driver;
	}
	By image=By.xpath("//img[@id='enterimg']");
	By switchTo=By.linkText("SwitchTo");
	By switchToMenu = By.xpath("//li[@class='dropdown']/a[contains(text(),'SwitchTo')]/following-sibling::ul[@class='dropdown-menu']");
	By frameLink = By.xpath("//li[@class='dropdown']/a[contains(text(),'SwitchTo')]/following-sibling::ul[@class='dropdown-menu']/li//a[contains(text(),'Frames')]");
	By singleFrame = By.id("singleframe");
	By inputUsername=By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input");
	By frameWithInaFrameBtn=By.xpath("//a[contains(text(),'Iframe with in an Iframe')]");
	By outerFrame=By.xpath("//div[@id='Multiple']//iframe[contains(text(),'<p>Your browser does not support iframes.</p>')] ");
	By innerFrame=By.xpath("");
	By innerInput=By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input");
	
	@When("User switch to Frame page")
		public void user_switch_to_Frame_page() {
			baseTest.getWebElement(image).click();
			baseTest.mouseHover(switchTo);
			baseTest.isVisible(baseTest.getWebElements(switchToMenu));
			baseTest.mouseHover(frameLink);
			baseTest.implicitWait();
			baseTest.getWebElement(frameLink).click();
			baseTest.pageLoadWait();
 			
			String parentWindowHandle=driver.getWindowHandle();
			System.out.println("--p-->"+parentWindowHandle);
 			Set<String> windowHandles=driver.getWindowHandles();
 			List l = new ArrayList(windowHandles);
 			System.out.println("List size:"+l.size());
 			System.out.println("from index 0"+l.get(0));
 			
 			
 			/*
 			
 			Iterator i=windowHandles.iterator();
 			
 			while(i.hasNext()){
 				System.out.println("-->"+(String)i.next());
 			}
 			
 			*/
			
			driver.switchTo().frame(baseTest.getWebElement(singleFrame));
			System.out.println("--c-->"+driver.getWindowHandle());
 			
 			
 			
 			
		}
		
		@Then("Enter uesrname")
		public void Enter_uesrname() {
 			baseTest.getWebElement(inputUsername).sendKeys("rajaraviteja");
 			driver.switchTo().defaultContent();
 			baseTest.getWebElement(frameWithInaFrameBtn).click();
 			System.out.println("============================================");
 			String parentWindowHandle=driver.getWindowHandle(); 
 			System.out.println("--p-->"+parentWindowHandle);
 	 		
 			driver.switchTo().frame(baseTest.getWebElement(outerFrame));
 			
 			
 			Set<String> windowHandles=driver.getWindowHandles();
 			List l = new ArrayList(windowHandles);
 			System.out.println("List size:"+l.size());
 			
 			driver.switchTo().frame(l.get(0).toString());
 			baseTest.getWebElement(innerInput).sendKeys("saiteja");
			//System.out.println("--c-->"+driver.getWindowHandle());
		
		}
	
}
