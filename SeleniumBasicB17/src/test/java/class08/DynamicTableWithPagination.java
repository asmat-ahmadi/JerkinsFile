package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class DynamicTableWithPagination extends CommonMethods {
        public static void main(String[] args) {

            String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
            String browser="chrome";
            openBrowserAndLaunchApplication(url,browser);
//        find the username
            WebElement usrName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
            usrName.sendKeys("Admin");
//        find the password
          WebElement paswrd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
            paswrd.sendKeys("Hum@nhrm123");

//        find the login button
           WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
            loginBtn.click();
            WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            pim.click();

            List<WebElement> idColum = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
////input[@id='search-results']/tbody/tr/td/[2]
            for (int i = 0; i <idColum.size(); i++) {
                String id = idColum.get(i).getText();
                if(id.equals("94945A")){
                WebElement check=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]"));
                    check.click();
                }
                
            }
        }

    }

