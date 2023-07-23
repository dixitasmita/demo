package pages;

import com.enums.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HomePage extends PageObject {

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Log In')])[1]")
    public WebElementFacade loginLink;

    @FindBy(how = How.ID, using = "qa-HOME_TITLE")
    public WebElementFacade homeTitle;

    @FindBy(how = How.ID, using = "qa-CREATE_NOTE")
    public WebElementFacade dropDownCreateNote;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='Title']")
    public WebElementFacade titleTextBox;

    @FindBy(how = How.ID, using = "qa-NAV_USER")
    public WebElementFacade profileDropDown;

    @FindBy(how = How.ID, using = "qa-ACCOUNT_DROPDOWN_LOGOUT")
    public WebElementFacade accountSignoutLink;

    @FindBy(how = How.XPATH, using = " //*[@id='qa-NOTE_ACTIONS']")
    public WebElementFacade actionLInk;

    @FindBy(how = How.ID, using = "qa-NAV_HOME")
    public WebElementFacade navHomeLink;





    /**
     * This will open the home page of the app
     * page url picked from serenity.properties file
     */
    public void openHomePage() {
        open();
        getDriver().manage().window().maximize();
    }


    /**
     * Click home login link
     */
    public void clickLoginLink() throws Exception {
        loginLink.click();
    }


    public boolean verifyHomeTitle() {
        withTimeoutOf(Duration.ofSeconds(30))
                .find(By.id("qa-HOME_TITLE"));

        return homeTitle.isPresent();
    }


    public void clickCreateNote() throws Exception {
        WebElement ele = getDriver().findElement(By.xpath("//div[@id='qa-HOME_NOTE_WIDGET_CREATE_NOTE']"));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", ele);
    }

    public void enterTextOnNote(String text) throws Exception {
        getDriver().switchTo().frame("qa-COMMON_EDITOR_IFRAME");
        titleTextBox.type(text);
        getDriver().switchTo().defaultContent();
    }

    public void clickSignOut() throws Exception {
        profileDropDown.click();
        accountSignoutLink.click();
    }

    public String verifyIfNoteIsThere(String note) throws Exception {
        WebElement ele = getDriver().findElement(By.xpath("//li[contains(text(),'Recent')]/following::span[contains(text(),'"+note+"')]"));
        return ele.getText();
    }

    public void clickHomeNav() throws Exception {
        navHomeLink.click();
    }

    public void clickActionLink() throws Exception {
        actionLInk.click();
    }

    public void clickDelete() throws Exception {
        WebElement ele = getDriver().findElement(By.xpath("//li[contains(text(),'Recent')]/following::span[contains(text(),'"+ TestData.Note.getValue() +"')]"));
        ele.click();
        actionLInk.click();
        WebElement element = getDriver().findElement(By.xpath("//span[contains(text(),'Move to Trash')]"));

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }
}






