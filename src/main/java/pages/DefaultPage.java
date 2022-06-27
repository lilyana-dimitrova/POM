package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/** The page that is opened after the URL is hit */

public class DefaultPage {

    WebDriver driver;

    @FindBy(id = "nav-link-login")
    WebElement loginButton;

    @FindBy(id = "nav-link-login")
    WebElement signInButton;

    public DefaultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }



}
