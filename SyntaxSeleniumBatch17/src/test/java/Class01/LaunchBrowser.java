package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public class LaunchBrowser1{

    }
    public static void main(String[] args) {
        //declare the insance of WebDriver
        WebDriver driver =new ChromeDriver();
        System.out.println(driver);
    }
}
