package com.fez.pages;

import generics.Utility;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.fez.base.HomePage;

public class ExpenseCreatePage extends HomePage {
	
	@FindBy(xpath="//select[@ng-model='selectedUser.id']")
	private WebElement selectEmp;
	
	@FindBy(xpath="//span[@class='input-group-addon btn-custom']")
	private WebElement enterDate;

	public ExpenseCreatePage(WebDriver driver) {
		super(driver);
	}

	public void select_Emp(String empID){
		/*ArrayList<String> allText=new ArrayList();
		allText=Utility.getAllTextFromListBox(selectEmp, 1);*/

		Select s=new Select(selectEmp);
		s.selectByVisibleText(empID);
	}
	
	public void enter_Date(String dt){
		enterDate.sendKeys(dt);
	}
	
	
	
}
