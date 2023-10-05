package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWFreind {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        driver.switchTo().frame(0); // driver to 1st frame
        driver.switchTo().frame(0); // driver to frame inside frame
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click(); // click checkbox

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));

        Select select = new Select(dropDown);
        select.selectByVisibleText("Baby Cat"); // select Baby Cat from in the Animals dropdown menu

        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);
        WebElement topicBox = driver.findElement(By.xpath("//input[@name='Topic']"));
        topicBox.sendKeys("topic name"); //filled in "topic name" in the text box?


    }
}

