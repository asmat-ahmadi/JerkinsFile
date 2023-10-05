package SeleniumHomeW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Howwork01 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVhdvdpQA1mbT3QcTQc2VtlKn-fmAfro59Jfq-GPsPqnOW2CHLY0cQAKMFG59zhmnldfINZjc&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-519198850%3A1696515596144108&theme=glif");
        driver.manage().window().maximize();
        WebElement help= driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacy= driver.findElement(By.xpath("//a[text()='Privacy']"));
        //;////a[@class='ytp-impression-link']
        WebElement terms= driver.findElement(By.xpath("//a[text()='Terms']"));
        help.click();
        privacy.click();
        terms.click();
        String gmailh=driver.getWindowHandle();
        System.out.println(gmailh);
        Set<String>allhandlse=driver.getWindowHandles();
        for(String handles:allhandlse){
            driver.switchTo().window(handles);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Terms of service"));
            break;


        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        }

    public static class Homework2 {
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
}

