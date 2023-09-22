package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loacators {
    public static void main(String[] args) {
        //instance
        WebDriver driver =new ChromeDriver();
        driver.get("http://35.175.58.98/input-form-locator.php");
        driver.manage().window().maximize();
        //locate the WebElement  fisrt name
        WebElement firstName=driver.findElement(By.id("first_name"));
        firstName.sendKeys("Habib");
        //locate the Webelement
        WebElement lastname=driver.findElement(By.name("last_name"));
        lastname.sendKeys("Ahmadi");
        WebElement email=driver.findElement(By.className("form-control-01"));
        email.sendKeys("usthabibi@gmail.com");
        WebElement submitBtn=driver.findElement(By.tagName("button"));
        submitBtn.click();
        WebElement linkBtn=driver.findElement(By.linkText("link"));
        linkBtn.click();
        WebElement clickHere=driver.findElement(By.partialLinkText("Here"));
        clickHere.click();





    }
}
