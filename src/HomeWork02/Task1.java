package HomeWork02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        //HOMEWORK TIME:
        //HW1:
        //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        //fill out the form
        //click on register
        //close the browser

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("customer.firstName")).sendKeys("Alper");
        driver.findElement(By.id("customer.lastName")).sendKeys("Bobaj");
        driver.findElement(By.id("customer.address.street")).sendKeys("20458 Taft Ter");
        driver.findElement(By.id("customer.address.city")).sendKeys("Ashburm");
        driver.findElement(By.id("customer.address.state")).sendKeys("Va");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("2317");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("5712345265");
        driver.findElement(By.id("customer.ssn")).sendKeys("1234456");
        driver.findElement(By.id("customer.username")).sendKeys("alperbob123");
        driver.findElement(By.id("customer.password")).sendKeys("123456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
        driver.findElement(By.className("button")).click();
        driver.quit();
       

    }
}
