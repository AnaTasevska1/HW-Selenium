package HWClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Avril");
        driver.findElement(By.id("customer.lastName")).sendKeys("Lavigne");
        driver.findElement(By.id("customer.address.street")).sendKeys("John Jones");
        driver.findElement(By.name("customer.address.city")).sendKeys("Toronto");
        driver.findElement(By.name("customer.address.state")).sendKeys("Canada");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("1000");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("437851234567");
        driver.findElement(By.name("customer.ssn")).sendKeys("123456");
        driver.findElement(By.id("customer.username")).sendKeys("AvrilLavig");
        driver.findElement(By.name("customer.password")).sendKeys("123456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
        Thread.sleep(3000);
        driver.quit();

    }
}

/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
Note: use name or id as locators
 */