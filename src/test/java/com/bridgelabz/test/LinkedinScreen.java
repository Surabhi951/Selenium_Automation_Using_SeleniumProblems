package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class LinkedinScreen extends BaseClass {

    @Test
    public void linkedinLoginPage() throws InterruptedException {
        driver.navigate().to("https://www.linkedin.com/home");
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/a")).click();
        driver.findElement(By.id("email-or-phone")).sendKeys("surabhibhagat95@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("forgotpassword");
        Thread.sleep(1000);
        driver.findElement(By.id("join-form-submit")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys("Surabhi");
        driver.findElement(By.id("last-name")).sendKeys("Bhagat");
        driver.findElement(By.id("join-form-submit")).click();
        Thread.sleep(1000);

        //total numbers of Iframe present in the webpage
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total number of frames: "+ size);

        //finding out the index of frame
        for (int i=0; i<=size; i++){
            driver.switchTo().frame(i);
            int total = driver.findElements(By.xpath("//iframe[@src='/checkpoint/challengeIframe/AQEijHgvNq3CBQAAAYadxhE5hnLO-PrznHNgFLuP_2KU_SY7xc4ZuRmR69qv8sPI5uCYGnKhtZk8dVT9upnkenYRg0wIKg?ut=1ZvbiSJ2wYGaE1'")).size();
            System.out.println(total);
            driver.findElement(By.name("phoneNumber")).sendKeys("8754961325");
            driver.findElement(By.id("register-phone-submit-button")).click();
            driver.switchTo().defaultContent();
        }
    }
}

