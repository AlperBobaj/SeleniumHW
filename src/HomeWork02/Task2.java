package HomeWork02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        /*
        HW2
navigate to fb.com
click on create new account
fill up all the textbooks
click on sign up button
close the pop-up
close the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Oscar");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Brown");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("Oscar123@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Oscar123@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password_step_input")).sendKeys("696969");
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("_8idr img")).click();
        Thread.sleep(2000);

     driver.quit();


    }
}
