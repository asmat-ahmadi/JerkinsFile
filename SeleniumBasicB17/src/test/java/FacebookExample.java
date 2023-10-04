import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement user=driver.findElement(By.id("email"));
        user.sendKeys("usthabibi@gmail.com");
        WebElement pass= driver.findElement(By.id("pass"));
        pass.sendKeys("ha99hyy76");
       // WebElement log= driver.findElement(By.name("login"));
       // log.click();
        WebElement create=driver .findElement(By.xpath("Create new account"));
        create.click();




    }
}


