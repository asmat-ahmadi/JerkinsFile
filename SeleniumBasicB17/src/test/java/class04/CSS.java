package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        WebElement profileID=driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("moassamSadiq");
        WebElement profilename=driver.findElement(By.cssSelector("input#profileBox"));
        profilename.sendKeys("hello");
        WebElement profilJenny=driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        profilJenny.sendKeys("Hi");
       // WebElement profilraj=driver.findElement(By.cssSelector("input[class='form-control feedbackBox2']"));
       // profilraj.sendKeys("Hii");
        WebElement profilraj=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        profilraj.sendKeys("WEBSITE IS WORKING");
        WebElement coursetopic=driver.findElement(By.cssSelector("input[name*=contentInput"));
        coursetopic.sendKeys("selenium");
        WebElement introtoAdv=driver.findElement(By.cssSelector("input[name^='IntroInput"));
        introtoAdv.sendKeys("selenium2");
        WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("all is good");

    }
}
