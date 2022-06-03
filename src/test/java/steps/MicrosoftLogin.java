package steps;

import driver.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.annotations.events.AfterScenario;
import org.openqa.selenium.WebDriver;
import po.MicrosoftLoginPo;

public class MicrosoftLogin {
    WebDriver driver = null;
    MicrosoftLoginPo microsoftLogin;

    @Given("I open the TMS page")
    public void i_open_the_TMS_page () {
        Base base = new Base(driver);
        this.driver = base.chromeDriver();

        this.driver.get("https://brokerage-test-tms.azurewebsites.net/createshipment");
        this.microsoftLogin = new MicrosoftLoginPo(driver);
    }

    @Then("I type my user name")
    public void iTypeMyUserName() throws InterruptedException {
        this.microsoftLogin.fillUserName();
    }

    @Then("I click something")
    public void iClickSomething() throws InterruptedException {
        this.microsoftLogin.clickSomething();
    }

    @AfterScenario
    public void closeBrowser () {
        if(this.driver != null){
            this.driver.quit();
        }
    }

    @Given("I am making a test {string}")
    public void iAmMakingATest(String arg0) {

    }
}
