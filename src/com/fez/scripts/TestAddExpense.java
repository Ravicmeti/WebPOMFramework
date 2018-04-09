package com.fez.scripts;

import org.testng.annotations.Test;

import com.fez.base.BaseTest;
import com.fez.pages.DashboardPage;
import com.fez.pages.ExpenseCreatePage;
import com.fez.pages.ExpenseListingPage;

public class TestAddExpense extends BaseTest {

	@Test
	public void testAddExpense() throws InterruptedException{
		
		DashboardPage dp= new DashboardPage(driver);
		dp.clickAdvance_Menu();
		dp.clickExpense_Menu();
		
		
		ExpenseListingPage elp= new ExpenseListingPage(driver);
		elp.click_AddExpense();
		Thread.sleep(50000);
		
		ExpenseCreatePage ecp=new ExpenseCreatePage(driver);
		ecp.select_Emp("mFive663");
		ecp.enter_Date("11-06-2017");
	}
	
}
