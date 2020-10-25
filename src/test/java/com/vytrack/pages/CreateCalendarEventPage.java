package com.vytrack.pages;

import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCalendarEventPage extends BasePage{

    private WebElement createCalendarEventBtn;

    @FindBy(css = "[title='Create Calendar Event']")
    private WebElement getCreateCalendarEventBtn;

    @FindBy(name = "or_calendar_event_form[title]")
    private WebElement titleInputBox;

    @FindBy(id = "tinymce")
    private WebElement descriptionInputBox;

    public void enterTitle(String text){
        BrowserUtils.enterText(titleInputBox, text);
    }
    public void clickOnCreateCalendarEvent(){
        BrowserUtils.clickOnElement(createCalendarEventBtn);
    }

    public void enterDescriptoin(String text){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        //exit all frames
        Driver.getDriver().switchTo().defaultContent();
        //wait for frame ans switch to it
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        //enter text
        BrowserUtils.enterText(descriptionInputBox, text);
        //exit from frame
        Driver.getDriver().switchTo().defaultContent();
    }
}
