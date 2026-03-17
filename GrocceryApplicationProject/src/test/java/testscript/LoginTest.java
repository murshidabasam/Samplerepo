package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	@Test
	public void verifyUserLoginValidCredentials() throws IOException
	{
		//WebElement usernametextField = driver.findElement(By.id("user-name"));
		//usernametextField.sendKeys("standard_user");
		//WebElement passwordtextFiel = driver.findElement(By.id("password"));
		//passwordtextFiel.sendKeys("secret_sauce");
		//WebElement loginButton = driver.findElement(By.id("login-button"));
		//loginButton.click();
		String username = ExcelUtility.readStringData(0, 0, "LoginPage");
		String password = ExcelUtility.readStringData(0, 1, "LoginPage");
		LoginPage  login = new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordNameOnPasswordTextField(password);
		login.LoginClick();
		//screenshot:helps in capturing the current situation of the browser when the testcase is failed
		
	}
	@Test
	public void verifyUserLoginInvalidCredentials() throws IOException
	{
		{
			String username = ExcelUtility.readStringData(1, 0, "LoginPage");
			String password = ExcelUtility.readStringData(1, 1, "LoginPage");
			LoginPage  login = new LoginPage(driver);
			login.enterUserNameOnUserNameField(username);
			login.enterPasswordNameOnPasswordTextField(password);
			login.LoginClick();
			
		}
	}
	@Test
	public void verifyUserLoginvalidUserNameInvalidPassword() throws IOException
	{
		{
			String username = ExcelUtility.readStringData(2, 0, "LoginPage");
			String password = ExcelUtility.readStringData(2, 1, "LoginPage");
			LoginPage  login = new LoginPage(driver);
			login.enterUserNameOnUserNameField(username);
			login.enterPasswordNameOnPasswordTextField(password);
			login.LoginClick();
		}
	}
	@Test
	public void verifyUserLoginInvalidUserNameValidPassword() throws IOException
	{
		{
			String username = ExcelUtility.readStringData(3, 0, "LoginPage");
			String password = ExcelUtility.readStringData(3, 1, "LoginPage");
			LoginPage  login = new LoginPage(driver);
			login.enterUserNameOnUserNameField(username);
			login.enterPasswordNameOnPasswordTextField(password);
			login.LoginClick();
		}
	}


}
