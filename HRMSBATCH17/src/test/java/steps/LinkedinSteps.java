package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinSteps {
    public WebDriver driver;
    @Given("user is navigated to Linkedin application")
    public void user_is_navigated_to_linkedin_application() throws InterruptedException {
    driver=new ChromeDriver();
    driver.get("https://www.linkedin.com/home");
    driver.manage().window().maximize();
    Thread.sleep(2000);

    }
    @When("user enters  username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        WebElement username= driver.findElement(By.xpath("//*[@id='session_key']"));
        username.sendKeys("usthabibi@gmail.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @When("user clicks on signin button")
    public void user_clicks_on_signin_button() throws InterruptedException {
        WebElement passcode= driver.findElement(By.xpath("//*[@id='session_password']"));
        passcode.sendKeys("xccv@1345");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @Then("user is successfully sign in")
    public void user_is_successfully_sign_in() {
        WebElement signin= driver.findElement(By.xpath("//*[@data-id='sign-in-form__submit-btn']"));
        signin.click();
    }
}
