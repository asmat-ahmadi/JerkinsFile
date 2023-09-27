package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        //instance
        WebDriver driver= new ChromeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();
        WebElement textBox1=driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("batch16");
        WebElement textBox2=driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("batch17");
        WebElement question1 = driver.findElement(By.xpath("//input[contains(@name,'security')]"));
       question1.sendKeys("What is the color of the sun");
        WebElement themagicalText = driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(themagicalText.getText());

//        get the text box
        WebElement textBoxAPI = driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        textBoxAPI.sendKeys("abracadabra");
        WebElement Email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        Email1.sendKeys("ajdlfjd@yahoo.com");
        WebElement Email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        Email2.sendKeys("ajdl90fjd@gmail.com");
        WebElement Email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        Email3.sendKeys("ajdl8uyfjd@yahoo.com");
        WebElement field1 = driver.findElement(By.xpath("//input[@data-detail='one'and@name='customField']"));
        field1.sendKeys("cat");
        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two'and@name='customField']"));
        field2.sendKeys("dog");
        WebElement Field1 = driver.findElement(By.xpath("//input[@data-detail='one'and@name='customField1']"));
        Field1.sendKeys("monkey");
        WebElement field4 = driver.findElement(By.xpath("//input[@data-detail='two'and@name='customField1']"));
        field4.sendKeys("donkey");
    }
}
