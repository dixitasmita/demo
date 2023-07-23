package steps;

import org.junit.Assert;

import com.exceptions.LinkNotVisibleException;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class VerifyLogin {

	LoginPage loginPage;

	@Step
	public void enterEmail(String email) throws Exception{
		loginPage.enterEmailID(email);
	}


	@Step
	public void clickContinue() throws Exception{
		loginPage.clickContinue();
	}

	@Step
	public void enterPassword(String password) throws Exception{
		loginPage.enterPassword(password);
	}


	@Step
	public void clickLogin() throws Exception{
		loginPage.clickLogin();
	}


}


