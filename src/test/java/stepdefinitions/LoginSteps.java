package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLogin();
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        String msg = loginPage.getMessage();
        assertTrue(msg.contains("You logged into a secure area!"));
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
