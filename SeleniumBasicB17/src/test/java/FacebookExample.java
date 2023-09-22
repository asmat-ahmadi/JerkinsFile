import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
       WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("usthabibi@gamil.com");
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("adf34456");
        WebElement  LoginBtn=driver.findElement(By.id("Login"));
        LoginBtn.click();

    }
}
