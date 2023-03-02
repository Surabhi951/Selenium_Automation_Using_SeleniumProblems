package com.bridgelabz.test;
import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;


public class WebinarScript extends BaseClass {

    @Test
    public void webinarScreen() throws InterruptedException {
        driver.get("https://bldev.bridgelabz.com/webinar");
        boolean flag  = driver.findElement(By.name("ContactNumber")).isDisplayed();
        if (flag) {
            Thread.sleep(500);
            driver.findElement(By.name("ContactNumber")).sendKeys("8475931265");
            Thread.sleep(500);
        }

        driver.findElement(By.id("deftemail")).sendKeys("surabhibhagat95@gmail.com");
        Thread.sleep(500);

        driver.findElement(By.name("fullName")).sendKeys("Surabhi Bhagat");
        Thread.sleep(500);

        List<WebElement> elements = driver.findElements(By.xpath("//div"));
        System.out.println("No of elements : " +elements.size());
        for (int i = 0; i < elements.size(); i++) {
            System.out.println("Element Text :" +elements.get(i).getAttribute("value"));
        }

        WebElement element = driver.findElement(By.name("passoutYear"));
        Thread.sleep(1000);
        element.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        element.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"passoutYears\"]/div[2]")).click();
        Thread.sleep(1000);


        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("deftdegree")));
        element1.click();
        System.out.println("Text : "+element1.getText());
        driver.findElement(By.xpath("//*[@id=\"degreeStreamOptions\"]/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("deftsbtn")).click();
        Thread.sleep(1000);
    }
}
