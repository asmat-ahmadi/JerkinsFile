package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ExtraDynamicTableP extends CommonMethods{
    public static void main(String[] args) throws InterruptedException {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url ,browser);
        WebElement user= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        user.sendKeys("admin");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement passW= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passW.sendKeys("Hum@nhrm123");
        WebElement click= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        click.click();
        WebElement pim= driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();//input[@id='empsearch_id']
        WebElement empID= driver.findElement(By.xpath("//input[@id='empsearch_id']"));
        empID.sendKeys("95108A");
        WebElement search= driver.findElement(By.xpath("//input[@id='searchBtn']"));
        search.click();
       // List<WebElement> column=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
       // for (int i = 0; i < column.size(); i++) {
         //  String id = column.get(i).getText();
           // if(id.contains("A")){
              //  WebElement checking= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]"));
               // checking.click();

            }


        }




