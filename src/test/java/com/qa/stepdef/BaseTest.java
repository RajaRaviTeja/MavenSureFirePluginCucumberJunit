package com.qa.stepdef;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

	public WebDriver driver;
	Alert alert;
	public BaseTest(){ 
		
	}
	
	
	public WebElement getWebElement(By identifier){
		pageLoadWait();
		scrollToView(driver.findElement(identifier));
		return driver.findElement(identifier);
	}

	public void scrollToView(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
//arguments[0].document.getElementById('fileupload').click()
	}
	
	
   public List<WebElement> getWebElements(By identifier){
	   pageLoadWait();
		return driver.findElements(identifier);
	}
	
	public void mouseHover(By identifier){
		pageLoadWait();	
		Actions act = new Actions(driver);
	  	   act.moveToElement(getWebElement(identifier)).build().perform();
	}
	
	public void isVisible(List<WebElement> list){
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElements(list));
	}
	
	public void implicitWait(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void pageLoadWait(){
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public boolean checkIfAlertDisplayed(){
		alert=driver.switchTo().alert();
		if(alert !=null)
		return true; 
		else return false;
	}
	
	public void declineAlert(){
	    alert.dismiss();	
	}
	
	 
	public void acceptAlert(){
		alert.accept();
	}
	
	
	public void sendTextToAlert(String input){
		alert.sendKeys(input);
	}
	
	public void doubleClick(By identifier){
		Actions act = new Actions(driver);
	  	   act.moveToElement(getWebElement(identifier)).doubleClick(getWebElement(identifier)).build().perform();
	}
	
	
}
