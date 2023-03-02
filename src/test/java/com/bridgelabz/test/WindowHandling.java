package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling extends BaseClass {

    @Test
    public void getWindowAndHandleIt() {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        String mainWindowHandle = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> iterator = allWindows.iterator();
        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println(text.getText());
            }
        }
    }
}
