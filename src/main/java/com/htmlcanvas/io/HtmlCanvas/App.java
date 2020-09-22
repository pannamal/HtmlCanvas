package com.htmlcanvas.io.HtmlCanvas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class App {

   
    public void draw() {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.htmlcanvasstudio.com/");
        WebElement element = driver.findElement(By.xpath("//canvas[@id='imageView']"));

        Actions builder = new Actions(driver);
        Action drawAction = builder.moveToElement(element, 200, 400)
                  .clickAndHold()
                  .moveByOffset(210, 70)
                  .moveByOffset(220, 75)
                  .release()
                  .build();
        drawAction.perform();
        
        
    }
    
   public static void main (String args[]) {
	   App s = new App();
	   s.draw();
	   
   }

}