package HomeWork01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {
        /**
         * 1. launch the browser
         * 2. navigate to amazon website
         * 3. print out the title and the url in the console
         * 4. close the browser
         */


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

       WebDriver driver=new ChromeDriver();
       driver.navigate().to("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        driver.close();

    }
}
