package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumHW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement selectDD= driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));
        selectDD.click();
       WebElement Ddestination=driver.findElement(By.linkText("Australia"));
       Ddestination.click();


    }
}
