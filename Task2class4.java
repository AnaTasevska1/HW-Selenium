package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2class4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement btn=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        btn.click();
        Thread.sleep(1000);

        WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select sel=new Select(month);
        sel.selectByVisibleText("Jul");

        WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select sel2=new Select(day);
        sel2.selectByIndex(15);

        WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select sel3=new Select(year);
        sel3.selectByValue("1990");

        Thread.sleep(3000);
        driver.quit();

    }
}


/*
hw2:
goto facebook.com
 click on create account
and select your date of birth using select class
 */