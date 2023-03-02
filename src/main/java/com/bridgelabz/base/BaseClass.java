package com.bridgelabz.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

    public void takeScreenShot() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src/main/Screenshot" +System.currentTimeMillis() +".png");
        FileUtils.copyFile(srcFile,destinationFile);
    }
}
