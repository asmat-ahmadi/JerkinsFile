import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/input-form-locator.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
       WebElement firstName =driver.findElement(By.name("first_name"));
       firstName.sendKeys("Habibib");
        WebElement lastname=driver.findElement(By.name("last_name"));
        lastname.sendKeys("ahmadi");
        WebElement Email=driver.findElement(By.name("email"));
        Email.sendKeys("dkfjdk@yahoo.com");
        WebElement button1=driver.findElement(By.id("submit_button"));
        button1.click();
        WebElement button2=driver.findElement(By.tagName("_blank"));
        button2.click();

    }
}
