package po;

import driver.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MicrosoftLoginPo extends Base {
    @FindBy(xpath = "//input[@type='email']")
    private WebElement userName;

    @FindBy(xpath = "//input[@value='Next']")
    private WebElement nextButton;

    @FindBy(xpath = "//input[@name='passwd']")
    private WebElement password;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement signIn;

     @FindBy(xpath = "//input[@value='Yes']")
     private WebElement yesButton;

     @FindBy(xpath = "//mat-icon[@mattooltip=\"Settings\"]")
     private WebElement settingsButton;

     @FindBy(xpath = "//a[text() = 'Logout']")
     private WebElement logoutButton;

     @FindBy(css = "div.table")
     private WebElement reLogginbutton ;

     @FindBy(css = "#otherTileText")
     private WebElement otherLoginButton;

    public MicrosoftLoginPo(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void fillUserName() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(this.userName));
        this.userName.sendKeys("INC-QA-Contributor@its4logistics.com");
        this.nextButton.click();

        wait.until(ExpectedConditions.visibilityOf(this.password));
        this.password.sendKeys("X7tX63vmGe6c");
        this.signIn.click();

        wait.until(ExpectedConditions.visibilityOf(this.yesButton));
        this.yesButton.click();

        int i = 0;
        while (i <= 0) {
            Thread.sleep(3000);

            wait.until(ExpectedConditions.visibilityOf(this.settingsButton));
            this.settingsButton.click();

            this.logoutButton.click();

            wait.until(ExpectedConditions.visibilityOf(this.reLogginbutton));
            this.reLogginbutton.click();

            wait.until(ExpectedConditions.visibilityOf(this.password));
            this.password.sendKeys("X7tX63vmGe6c");

            wait.until(ExpectedConditions.visibilityOf(this.signIn));
            wait.until(ExpectedConditions.elementToBeClickable(this.signIn));
            this.signIn.click();

            wait.until(ExpectedConditions.visibilityOf(this.yesButton));
            this.yesButton.click();

            i++;
        }

        Thread.sleep(10000);
        this.driver.close();

    }


    public void clickSomething() throws InterruptedException {
        this.nextButton.click();
    }

}
