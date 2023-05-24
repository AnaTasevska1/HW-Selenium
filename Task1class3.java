package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1class3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement name= driver.findElement(By.cssSelector("input[name='first_name']"));
        name.sendKeys("David");
        WebElement lastN=driver.findElement(By.xpath("//input[@name='last_name']"));
        lastN.sendKeys("Beckham");
        WebElement mail=driver.findElement(By.cssSelector("input[name='email']"));
        mail.sendKeys("david.beckham@test.com");
        WebElement phone=driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("(143)778-4569");
        WebElement address=driver.findElement(By.cssSelector("input[placeholder='Address']"));
        address.sendKeys("John Jones");
        WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("London");
        WebElement state=driver.findElement(By.cssSelector("select[name='state']"));
        state.sendKeys("Hawaii");
        WebElement zip=driver.findElement(By.xpath("//input[@name='zip']"));
        zip.sendKeys("1000");
        WebElement website=driver.findElement(By.cssSelector("input[name='website']"));
        website.sendKeys("www.davidbeckham.com");
        WebElement hosting=driver.findElement(By.cssSelector("input[value='yes']"));
        hosting.click();

        WebElement project=driver.findElement(By.cssSelector("textarea[name='comment']"));
        project.sendKeys("The project is about Football");
        WebElement send=driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        Thread.sleep(3000);
        send.click();

    }

}


/*
use css and xpath to do this
HW1:
Open Chrome browser
Go to http://practice.syntaxtechs.net/input-form-demo.php
fill in the complete form
 */