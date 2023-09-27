import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        // Find the email/phone input field and enter your email/phone
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("usthabibi@gmail.com");

        // Find the password input field and enter your password
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("habib1978");


        //WebElement loginBtn = driver.findElement(By.id("u_0_b"));
       // JavascriptExecutor executor = (JavascriptExecutor) driver;
       // executor.executeScript("arguments[0].click();", loginBtn);
        // Find the Login button and click it
       // WebElement loginBtn = driver.findElement(By.id("login"));
       // loginBtn.click();

        // You may need to add additional logic here to handle login success or failure

        // Close the browser when done
        driver.quit();
    }
}


