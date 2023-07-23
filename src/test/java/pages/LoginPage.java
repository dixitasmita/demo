package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

	@FindBy(how=How.ID, using="username")
	public WebElementFacade emailField;

	@FindBy(how=How.ID, using="loginButton")
	public WebElementFacade continueButton;

	@FindBy(how=How.ID, using="password")
	public WebElementFacade passwordField;

	@FindBy(how=How.ID, using="loginButton")
	public WebElementFacade loginButton;

	@FindBy(how=How.ID, using="recaptcha-anchor")
	public WebElementFacade recaptcha;

	@FindBy(how=How.XPATH, using="//input[@value='Reset Password']")
	public WebElementFacade resetPassword;



	public void enterEmailID(String emailID) throws Exception{
		emailField.type(emailID);
	}


	public void clickContinue() throws Exception{
		byPassCaptcha();
		continueButton.click();
	}

	public void enterPassword(String password) throws Exception{
		passwordField.type(password);
	}

	public void clickLogin() throws Exception{
		loginButton.click();
	}

	public void byPassCaptcha(){
		if(recaptcha.isVisible()){
			recaptcha.click();
		}
	}

	public boolean verifyResetPasswordLink(){
		return resetPassword.isPresent();
	}



}
