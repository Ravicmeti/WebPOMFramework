package com.fez.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.fez.base.BasePage;

public class LoginPage extends BasePage{
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(name="submit")
	private WebElement btnLogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login(String un,String pw){
		txtUsername.sendKeys(un);
		txtPassword.sendKeys(pw);
		btnLogin.click();
	}
}
