package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1class4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement days = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select sel= new Select(days);
        sel.selectByVisibleText("Tuesday");
        Thread.sleep(2000);
        sel.selectByValue("Thursday");
        Thread.sleep(2000);
        sel.selectByIndex(6);

        Thread.sleep(3000);
        driver.quit();

    }
}

/*
HW1:
goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one
 */