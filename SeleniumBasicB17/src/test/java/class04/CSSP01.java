package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSP01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement profileId=driver.findElement(By.cssSelector("input[id='profileID']"));
        profileId.sendKeys("Zainab");
        WebElement profilebox=driver.findElement(By.cssSelector("input#profileBox"));
        profilebox.sendKeys("Hello");
        WebElement feedb=driver.findElement(By.cssSelector("input#feedback"));
        feedb.sendKeys("positve");
        WebElement feedb2=driver.findElement(By.cssSelector("input[class='form-control feedbackBox2']"));
        feedb2.sendKeys("negative");
        WebElement email=driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("hjggf@yahoo.com");//
        WebElement topic=driver.findElement(By.cssSelector("input[data-content='CSS is an intermediate topic']"));
        topic.sendKeys("greeting");
        WebElement intro=driver.findElement(By.cssSelector("input[name='IntroInput556']"));
        intro.sendKeys("jjj");
    }
}
