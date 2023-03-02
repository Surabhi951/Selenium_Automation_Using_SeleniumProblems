package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends BaseClass {

    @Test
    public void javaScriptExecutor_TestGuru99_Website() {
        driver.get("https://www.guru99.com/api-testing.html");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        System.out.println("execute script : " + executor.executeScript("return window.length"));
        int noOfFrames = Integer.parseInt(executor.executeScript("return window.length").toString());
        System.out.println("No of frames : " + noOfFrames);
    }
}
