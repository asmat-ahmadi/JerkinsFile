package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework04 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/amazonprime");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement test=driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
       // userName.sendKeys("abc");
       // userName.clear();
      //  userName.sendKeys(Keys.CONTROL + "a");
       // userName.sendKeys(Keys.DELETE);
        test.sendKeys("Glasscups");
        //
        //WebElement password=driver.findElement(By.id("password"));
       // password.sendKeys("habib1978");
        WebElement loginB=driver.findElement(By.xpath("//input[@value='Go']"));
        loginB.click();////span[@class='a-truncate-cut']
        //String log=loginB.getText();
        //System.out.println("mylogin"+log);
        WebElement loginBb=driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
        loginBb.click();////span[@class='a-truncate-cut']

    }
}
