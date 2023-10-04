package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDD {

        public static void main(String[] args) {
            //instance
            WebDriver driver = new ChromeDriver();
// goto facebook.com
            driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
//        maximize the window
            driver.manage().window().maximize();

//        find the drop down
            WebElement dd = driver.findElement(By.xpath("//select[@id='multi-select']"));

//        create an object of the select class
            Select sel =new Select(dd);

//
            sel.selectByVisibleText("Texas");

            sel.selectByValue("Florida");

            sel.deselectByVisibleText("Texas");
            System.out.println(sel.isMultiple());
            sel.getAllSelectedOptions();



        }
    }









