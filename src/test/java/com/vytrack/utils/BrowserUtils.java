package com.vytrack.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowerUtils {
    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public static void wait(int seconds){
        try{
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void clickOnElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        ((JavascriptExecutor)(Driver.getDriver())).executeScript("arguments[0].click()", element);
    }
    public static void enterText(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
        System.out.println("Entering text: " + text);

    }
}
