package HomeWork03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {


/*
HW
use xpath to complete this

goto http://practice.syntaxtechs.net/basic-first-form-demo.php
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc which are used in most of the web applications around the world.
enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL

 */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        //enter message
        driver.findElement(By.xpath("//input[@placeholder = 'Please enter your Message']")).sendKeys("Tester");
         //click on the message
        driver.findElement(By.xpath("//button[text() = 'Show Message']")).click();
        //Enter value of a
        driver.findElement(By.xpath("//input[@id = 'sum1']")).sendKeys("5");
        //Enter value of b
        driver.findElement(By.xpath("//input[@id = 'sum2']")).sendKeys("10");
        //click on the button get total
      WebElement buttonclick= driver.findElement(By.xpath("//button[text() = 'Get Total']"));

      buttonclick.click();
        System.out.println(buttonclick.getText());

}


    }


