package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement help= driver.findElement(By.xpath("//a[text()='Help']"));
        help.click();
        WebElement privacy= driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();////a[@class='ytp-impression-link']
        WebElement terms= driver.findElement(By.xpath("//a[text()='Terms']"));
        terms.click();
        WebElement youtube= driver.findElement(By.xpath("//a[@class='ytp-impression-link']"));
        youtube.click();

    }
}
