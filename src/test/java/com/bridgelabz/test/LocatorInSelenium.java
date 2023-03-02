package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorInSelenium extends BaseClass {

    @Test
    public void useLocators_ToIdentifyWebElement() throws InterruptedException {
        driver.get("https://bldev.bridgelabz.com/webinar");
//        driver.navigate().to("https://mvnrepository.com/artifact/org.testng/testng/7.7.0");
//        driver.get("https://www.facebook.com/");

        WebElement phoneNumber = driver.findElement(By.id("deftphnumber"));
        phoneNumber.sendKeys("8754123659");

        driver.findElement(By.tagName("input"));

        driver.findElement(By.name("email")).sendKeys("surabhibhagat95@gmail.com");

        WebElement element = driver.findElement(By.xpath("/html/body/section[1]/div/div[6]/div[2]/div[1]/div/input"));
        Thread.sleep(1000);
        element.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        element.click();

        driver.findElement(By.cssSelector("input#deftusername")).sendKeys("Surabhi Bhagat");
        driver.findElement(By.xpath("//input[@name='passoutYear']")).click();
        driver.findElement(By.className("anchor-tag")).click();

        String title = driver.getTitle();
        Assert.assertEquals("BridgeLabz: Guaranteed Emerging Tech Job",title);

        String pageSource = driver.getPageSource();
        System.out.println("PageSource : "+pageSource);
//
//        System.out.println("Current page url : "+driver.getCurrentUrl());
//        WebElement element1 = driver.findElement(By.linkText("Gradle"));
//        Thread.sleep(1000);
//        element1.sendKeys(Keys.PAGE_DOWN);
//        Thread.sleep(1000);
//        element1.click();
//        Thread.sleep(1000);

//        WebElement element2 = driver.findElement(By.partialLinkText("Forgotten"));
//        Thread.sleep(1000);
//        element2.click();
//        Thread.sleep(1000);


    }

}
