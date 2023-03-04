package HomeWork04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the checkbox    "click on this check box" is Selected
if no  Select the checkbox
check gain if the checkbox is Selected or not
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc which are used in most of the web applications around the world.
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");


        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

      WebElement checkBoxBtn= driver.findElement(By.xpath("//input[@id='myCheck']"));
      boolean checkBox=checkBoxBtn.isSelected();
        System.out.println("Is check box selected"+checkBox);
      if(!checkBox){
          checkBoxBtn.click();
      }
       checkBox=checkBoxBtn.isSelected();
        System.out.println("is check box selected"+checkBox);
    }
}
