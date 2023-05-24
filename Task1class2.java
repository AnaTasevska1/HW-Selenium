package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1class2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("David");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Beckham");
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("number7");
        driver.findElement(By.xpath("//select[@aria-label='Month']")).findElement(By.xpath("//option[text()='May']")).click();
        driver.findElement(By.xpath("//select[@name='birthday_month']")).findElement(By.xpath("//option[text()='2']")).click();
        driver.findElement(By.xpath("//select[@name='birthday_year']")).findElement(By.xpath("//option[text()='1975']")).click();
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(1000);
        driver.quit();

    }
}

/*
HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account
 */