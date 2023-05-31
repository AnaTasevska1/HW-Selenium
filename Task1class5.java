package HWSelenium;

import Utils.CommonMethods2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1class5 extends CommonMethods2{
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        Thread.sleep(1000);

        WebElement alert1Btn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert1Btn.click();
        Thread.sleep(2000);

        Alert alert2Btn=driver.switchTo().alert();
        alert2Btn.sendKeys("abracadabra");
        alert2Btn.accept();

        Thread.sleep(5000);
        driver.quit();

    }
}

/*
http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it

Note: dont worry if the text u send doesnt appears up in the textbox
 */