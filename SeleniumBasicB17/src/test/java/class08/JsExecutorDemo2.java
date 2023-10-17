package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://35.175.58.98/input-form-locator.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);


        WebElement inputBox = driver.findElement(By.xpath("//input[@id='first_name']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement inputBox1 = driver.findElement(By.xpath("//input[@id='first_name']"));
        inputBox1.sendKeys("habibi");
        WebElement inputBox2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        inputBox2.sendKeys("Ahmadi");
        js.executeScript("arguments[0].style.border='5px solid red'",inputBox);
        WebElement inputBox3 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        JavascriptExecutor js1=(JavascriptExecutor) driver;
        js1.executeScript("arguments[0].style.border='5px solid blue'",inputBox3);
       //
        WebElement inputBox4 = driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']"));
        JavascriptExecutor js2=(JavascriptExecutor) driver;
        js2.executeScript("arguments[0].style.border='5px solid green'",inputBox4);
    }

}
