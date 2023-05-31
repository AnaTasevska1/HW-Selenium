package HWSelenium;

import Utils.CommonMethods2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2class5 extends CommonMethods2 {
    public static void main(String[] args) throws InterruptedException {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.switchTo().frame(0);

        //click on checkbox
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.id("a")).click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        //select baby cat from drop down
        driver.switchTo().frame(1);
        WebElement dropDown= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dropDown);
        sel.selectByVisibleText("Baby Cat");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        //enter text in text box
        driver.switchTo().frame(0);
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Great job");

        Thread.sleep(3000);
        driver.quit();


    }
}

/*
HW2:
goto https://chercher.tech/practice/frames

click on check box
then select baby cat from drop down
then enter text in text box

 */
