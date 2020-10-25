package com.vytrack.step_definitions;

import com.vytrack.pages.CreateCalendarEventPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Map;

public class CreateCalendarEventStepDefinitions {
    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();

    @Given("user clicks on create calendar event button")
    public void user_clicks_on_create_calendar_event_button() {

    }

    /*
      | Title       | B20 Graduation Party                        |
      | Description | All B20 friends are invited for this party! |
     */
    @When("user adds new calendar event information")
    public void user_adds_new_calendar_event_information(Map<String, String> data) {
        String title = data.get("Title");
        String description = data.get("Description");

        createCalendarEventPage.enterDescriptoin(description);
        createCalendarEventPage.enterTitle(title);
    }
}
