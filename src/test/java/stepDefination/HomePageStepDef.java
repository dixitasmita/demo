package stepDefination;


import java.util.List;

import com.enums.TestData;
import com.exceptions.LinkNotVisibleException;
import com.exceptions.NoteNotFoundException;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import steps.VerifyLogin;

public class HomePageStepDef {

    HomePage homepage;
    LoginPage loginPage;

    @Steps
    VerifyLogin verifyLogin;



    @Given("user navigates to homepage")
    public void user_navigates_to_homepage() {
        homepage.open();
    }

    @And("click on login link")
    public void user_click_on_login_link() throws Exception {
        homepage.clickLoginLink();
    }

    @When("user enter invalid login details")
    public void user_enter_invalid_login_details() throws Exception {
        verifyLogin.enterEmail(TestData.InValidEmail.getValue());
        verifyLogin.clickContinue();
        verifyLogin.enterPassword(TestData.Password.getValue());
        verifyLogin.clickLogin();
    }

    @Then("user not able to login")
    public void user_not_able_to_login() {
        try {
            Assert.assertTrue(loginPage.verifyResetPasswordLink());
        } catch (Exception e) {
            throw new LinkNotVisibleException("Reset password button not present on page");
        }
    }

    @When("user enter valid login details")
    public void user_enter_valid_login_details() throws Exception {
        verifyLogin.enterEmail(TestData.ValidEmail.getValue());
        verifyLogin.clickContinue();
        verifyLogin.enterPassword(TestData.Password.getValue());
        verifyLogin.clickLogin();
    }

    @Then("user able to login")
    public void user_able_to_login() {
        try {
            Assert.assertTrue(homepage.verifyHomeTitle());
        } catch (Exception e) {
            throw new LinkNotVisibleException("User not able to login");
        }
    }

    @When("user create a note")
    public void user_create_a_note() throws Exception {
        homepage.clickCreateNote();
        homepage.enterTextOnNote(TestData.Note.getValue());

    }

    @Then("note should be created")
    public void note_should_be_created() throws Exception {
        homepage.clickHomeNav();
        Assert.assertEquals(TestData.Note.getValue(),
                homepage.verifyIfNoteIsThere(TestData.Note.getValue()));
    }

    @Then("user logout from the site")
    public void user_logout_from_the_site() throws Exception {
        homepage.clickSignOut();
    }


    @Then("created note should be there")
    public void created_note_should_be_there() throws Exception {
		try {
			Assert.assertEquals(TestData.Note.getValue(),
					homepage.verifyIfNoteIsThere(TestData.Note.getValue()));
		} catch (Exception e) {
			throw new NoteNotFoundException("Note not present");
		}

    }


}
