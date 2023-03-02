package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class SelectClassDemo extends BaseClass {

    public Select dropDown;

    @BeforeTest
    public void navigateOnFacebookLoginScreen_Success() throws IOException {
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Facebook – log in or sign up");
        takeScreenShot();
    }

    @Test
    public void redirectOnToFbScreen_IdDisplayedImg() throws IOException {
        boolean flag = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img")).isDisplayed();
        Assert.assertTrue(flag);
        takeScreenShot();
    }

    @Test
    public void createScreen() throws InterruptedException, IOException {
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Surabhi");
        Thread.sleep(500);

        driver.findElement(By.name("lastname")).sendKeys("Bhagat");
        Thread.sleep(500);

        driver.findElement(By.name("reg_email__")).sendKeys("surabhibhagat95@gmail.com");
        Thread.sleep(500);

        driver.findElement(By.id("password_step_input")).sendKeys("Surabhi@123");
        Thread.sleep(500);

        WebElement dayDropDown = driver.findElement(By.name("birthday_day"));
        dropDown = new Select(dayDropDown);
        dropDown.selectByVisibleText("1");
        Thread.sleep(1000);

        WebElement monthDropDown = driver.findElement(By.id("month"));
        dropDown = new Select(monthDropDown);
        dropDown.selectByIndex(10);
        Thread.sleep(1000);

        WebElement yearDropDown = driver.findElement(By.name("birthday_year"));
        dropDown = new Select(yearDropDown);
        dropDown.selectByValue("1995");
        Thread.sleep(1000);

        driver.findElements(By.name("sex")).get(0).click();
//        List<WebElement> gender = driver.findElements(By.name("sex"));
//        System.out.println("Size of the list : "+gender.size());
//        for (int i=0; i< gender.size(); i++) {
//            if (i == 0) {
//                gender.get(i).click();
//            }
//        }

        boolean flag = driver.findElements(By.name("sex")).get(0).isSelected();
        if (flag == true) {
            System.out.println("Female radio button selected");
        }
        else {
            driver.findElements(By.name("sex")).get(0).click();
        }
        takeScreenShot();
    }
}
