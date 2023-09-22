package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.quit();//driver.close

    }
}
