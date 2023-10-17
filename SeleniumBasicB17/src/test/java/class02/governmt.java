package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class governmt {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.governmentjobs.com");
        driver.manage().window().maximize();
        WebElement searchb=driver.findElement(By.xpath("//input[@id='keyword-search-input']"));
        searchb.sendKeys("case manger");
        WebElement search1=driver.findElement(By.xpath("//input[@id='location-search-input']"));
        search1.sendKeys("virginia");
        WebElement findjob=driver.findElement(By.xpath("//button[@class='btn btn-gjobs-primary']"));
        findjob.click();////a[text()='Submit Now']
        WebElement submit=driver.findElement(By.xpath("//a[text()='Submit Now']"));
        submit.click();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.governmentjobs.com");

    }
}
