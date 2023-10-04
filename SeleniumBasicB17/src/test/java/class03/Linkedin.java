package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/home");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement user=driver.findElement(By.name("session_key"));
        user.sendKeys("usthabibi@gmail.com");
        WebElement pass= driver.findElement(By.id("session_password"));
        pass.sendKeys("Asiuyyt6");
       // WebElement forgotp=driver.findElement(By.className( "sign-in-form__forgot-password--full-width"));
       // forgotp.click();
        WebElement log= driver.findElement(By.className("sign-in-form__submit-btn--full-width"));
        log.click();
        //WebElement forgotp=driver.findElement(By.className( "sign-in-form__forgot-password--full-width"));
        //forgotp.click();
}}
