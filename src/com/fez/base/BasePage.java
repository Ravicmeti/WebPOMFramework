package com.fez.base;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generics.Utility;

public abstract class BasePage 
{
  public Logger log=Logger.getLogger(this.getClass());
  public long timeout=Long.parseLong(Utility.getPropertyValue(AutomationConstants.CONFIG_PATH, "EXPLICIT"));
  public WebDriver driver;
  public WebDriverWait wait;
  
  public BasePage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  wait=new WebDriverWait(driver, timeout);
  }
  
  public void verifyURLhas(String expectedUrl)
  {
	  new WebDriverWait(driver,timeout).until(ExpectedConditions.urlContains(expectedUrl));
  }
  
  public void verifyElementIsNotPresent(By loc)
  {
	  try
	  {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		  log.error("Fail: Element is Present");
		  Assert.fail();
	  }
	  catch(Exception e)
	  {
		  log.error("Pass: Element is not Present");
	  }
  }
  
  public void verifyListBoxHasNoDuplicate(WebElement listbox,int startIndex)
  {
	  ArrayList<String> allText = Utility.getAllTextFromListBox(listbox,startIndex);
	  boolean hasDuplicate = Utility.checkArrayListHasDuplicate(allText);
	  Assert.assertFalse(hasDuplicate,"ListBox has Duplicate");
  }
  
  public  boolean verifyElementsIsPresentOrNot(WebElement element)
  {
	  try
	  {
		  wait.until(ExpectedConditions.visibilityOf(element));
		  return true;
	  }
	  catch(Exception e)
	  {
		  return false;
	  }
  }
  
  public void verifyElementsIsPresent(WebElement element)
  {
	 log.info("Verify Element is Present");
	 boolean present = Utility.verifyElementsIsPresent(driver, element);
	 Assert.assertTrue(present,"Element is not present");
	 log.info("Element is Present");
  }
  
  public void waitAndClick(WebElement element)
  {
	  wait.until(ExpectedConditions.visibilityOf(element));
	  element.click();
  }
  
  public void verifyListBoxIsSorted(WebElement listBox,int startIndex)
  {
	  ArrayList<String> allText = Utility.getAllTextFromListBox(listBox,startIndex);
	  boolean sorted = Utility.checkArrayListIsSorted(allText);
	  Assert.assertTrue(sorted,"ListBox is Not Sorted");
  }
}
