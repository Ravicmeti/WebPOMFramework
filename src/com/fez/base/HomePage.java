package com.fez.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.Utility;

public abstract class HomePage extends BasePage{

	@FindBy(xpath="//img[@id='profile-img']")
	private WebElement profile;
	
	@FindBy(xpath="//a[text()='sign out']")
	private WebElement logout;
	
	@FindBy(xpath="//li//a[text()='Advanced']")
	private WebElement advance_Menu;
	
	@FindBy(xpath="//li//a[@href='expenseConfig.action#/']")
	private WebElement expenseOption_Menu;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement empList_Menu;
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement admin_Menu;
	
	@FindBy(id="menu_admin_Configuration")
	private WebElement configuration_Menu;
	
	@FindBy(id="menu_admin_pimCsvImport")
	private WebElement dataImport_Menu;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	private WebElement recruitment_Menu;
	@FindBy(id="menu_recruitment_viewJobVacancy")
	private WebElement vacancy_Menu;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	private WebElement leave_Menu;
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void clickAdvance_Menu()
	{
		advance_Menu.click();
	}
	
	public void clickEmpList_Menu()
	{
		empList_Menu.click();
	}
	
	public void clickExpense_Menu()
	{
		expenseOption_Menu.click();
	}
	
	public void clickAdmin_Menu()
	{
		admin_Menu.click();
	}
	
	public void click_Configuration_Menu()
	{
		configuration_Menu.click();
	}
	
	public void click_DataImport_Menu()
	{
		dataImport_Menu.click();
	}
	public void click_Recruitment_Menu()
	{
		recruitment_Menu.click();
	}
	public void click_Vacancy_Menu()
	{
		vacancy_Menu.click();
	}
	public void click_Leave_Menu()
	{
		leave_Menu.click();
	}


	public void logout()
	{
//		welcome.click();
		Utility.clickUsingJs(driver, profile);
		waitAndClick(logout);
	}
}
