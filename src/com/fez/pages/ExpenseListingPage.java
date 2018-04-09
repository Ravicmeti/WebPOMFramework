package com.fez.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.fez.base.HomePage;

public class ExpenseListingPage extends HomePage {

	@FindBy(xpath="//a[@href='#/create']")
	private WebElement addButton;
	
	public ExpenseListingPage(WebDriver driver) {
		super(driver);
	}
	
	public void click_AddExpense(){
		addButton.click();
	}

	
}
