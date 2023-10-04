import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
driver.manage().window().maximize();
        //        select the check box
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox1.click();
//        if it is selected after click
        boolean selectState = checkBox1.isSelected();
        if(selectState){
            System.out.println("the checkbox is selected");
        }
        else{
            System.out.println("the checkbox isnt selected");

            //        select  all options


            }
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement checkBox:checkBoxes){
//            click on it
            checkBox.click();
        }
    }
    }

