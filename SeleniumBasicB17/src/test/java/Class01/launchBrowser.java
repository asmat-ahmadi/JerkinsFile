package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            String currentlyUrl= driver.getCurrentUrl();
            Thread.sleep(2000);
            driver.quit();
    }


    }

