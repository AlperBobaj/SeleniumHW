package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       WebElement userName=  driver.findElement(By.xpath("//input[@id='txtUsername']"));
       userName.sendKeys("Admin");
     WebElement pass= driver.findElement(By.xpath("//input[@id='txtPassword']"));
     pass.sendKeys("Hum@nhrm123");
      WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
      login.click();
     WebElement pim= driver.findElement(By.xpath("//b[text() = 'PIM']"));
     pim.click();
    List<WebElement> id= driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i = 0; i < id.size() ; i++) {
           String text= id.get(i).getText();
           if(text.equalsIgnoreCase("51885A")){
               System.out.println("The id is in row nr "+(i+1));
       driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")).click();
       driver.quit();
           }

        }


    }
}
