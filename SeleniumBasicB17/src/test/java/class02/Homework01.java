package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement email=driver.findElement(By.id("email"));
       // userName.sendKeys("abc");
       // userName.clear();
      //  userName.sendKeys(Keys.CONTROL + "a");
       // userName.sendKeys(Keys.DELETE);
        email.sendKeys("usthabibi@gmail.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("habib1978");
        WebElement loginB=driver.findElement(By.id("login"));
        loginB.click();
        String log=loginB.getText();
        System.out.println("mylogin"+log);


    }
}
