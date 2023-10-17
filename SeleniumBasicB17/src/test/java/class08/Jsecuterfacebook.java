package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Jsecuterfacebook extends CommonMethods {
    public static void main(String[] args) {
        String url="https://www.facebook.com";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement firstN= driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
        JavascriptExecutor Fb=(JavascriptExecutor) driver;
        Fb.executeScript("arguments[0].style.border='5px solid blue'",firstN);
        WebElement pass= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        JavascriptExecutor pas=(JavascriptExecutor) driver;
        pas.executeScript("arguments[0].style.border='5px solid red'",pass);
        WebElement pass1= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        JavascriptExecutor pas1=(JavascriptExecutor) driver;
        pas1.executeScript("arguments[0].style.border='5px solid red'",pass1);


    }

}
