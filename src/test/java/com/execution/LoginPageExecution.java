package com.execution;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.locators.LoginPageLoc;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageExecution extends LoginPageLoc{
	
	@Parameters({"username"})
	@Ignore
	@Test
	public void username(String user)  {
		BaseClass.sendkeys(new LoginPageLoc().getusername(), user);
	}
	
	@Parameters({"password"})
	@Ignore
	@Test(priority = 1)
	public void password(String pass) {
		BaseClass.sendkeys(new LoginPageLoc().getpassword(), pass);
	}
	@Ignore
	@Test(priority = 2)
	public void loginClick() {
		BaseClass.click(new LoginPageLoc().getlogin());
	}
	
	

}
