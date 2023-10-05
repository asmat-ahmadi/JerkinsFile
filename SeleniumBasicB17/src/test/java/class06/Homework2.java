package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();
        // how to enter to the frame
        // the reason we created two frame to enter into another frame inside the frame
        driver.switchTo().frame("textfieldIframe");
        driver.switchTo().frame(0);
        // driver.switchTo().frame(0); // alternative way driver to 1st frame
        //driver.switchTo().frame(0); // alternative way driver to frame inside frame
        WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
       driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement animal= driver.findElement(By.xpath("//select[@id='animals']"));
        Select option= new Select(animal);
        option.selectByValue("babycat");

        driver.switchTo().defaultContent();

        WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='textfieldIframe']"));
        driver.switchTo().frame(iFrame);
        //locate input element Topic and send some text
        driver.findElement(By.xpath("//input[@name='Topic']")).sendKeys("Batch17");



        }
    }

