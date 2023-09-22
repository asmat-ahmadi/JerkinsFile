package Practiceclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classS01 {
    public static void main(String[] args) throws InterruptedException {
        // create the instance of WebDriver
        WebDriver driver =new ChromeDriver();
        // use driver.get method
        driver.get("https://www.alibaba.com");
        // to maximize the screen
        driver.manage().window().maximize();
        //creating the current URL on your console
        String currentURL=driver.getCurrentUrl();
        System.out.println("Here is the current url is"+currentURL);
        // creating the title of your current URL
        String title=driver.getTitle();
        System.out.println("here is the title of your Web "+title);
        //Creating delay or wait to see the URL or web 1000 millissecond =one second
        Thread.sleep(5000);
        // creating closing point to disappear from the PC after opening
        driver.quit();
        // we can add String = a variable infront of currentUrl and title =gettitle/getCurrent
    }
}
