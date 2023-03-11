package HomeWork05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {

        /*
HW
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
2.Click on the "Start" button to initiate the loading of a hidden element
3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
4.Click the "Finish" button to reveal the hidden element
5.Verify that the text "Hello World!" is now displayed on the page (edited)


         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement startButton= driver.findElement(By.xpath("//button[text() = 'Start']"));
        startButton.click();
       WebElement finishButton=driver.findElement(By.xpath(" //div@id= 'finish']"));
       finishButton.click();
       WebElement text=driver.findElement(By.xpath("//h4[text() = 'Hello World!']"));
       text.click();
        System.out.println(finishButton.getText()+"Is displayed"+finishButton.getText()+"is Is not displayed");
        driver.quit();



    }
}
