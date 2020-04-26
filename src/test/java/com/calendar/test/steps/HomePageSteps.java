package com.calendar.test.steps;

import com.calendar.base.BasePOM;
import com.calendar.utils.DateTimeUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePageSteps extends BasePOM {

    @Given("^I have launched the Calendar App$")
    public void userAccessedApp() {
        System.out.println("Calendar App is loading");
        getDriver();
        homePage().clickOnSkipButton();
        homePage().clickOnStartButton();
        homePage().acceptPhoneContactAndCalendar();;
    }

    @When("^It is not a weekend (.*)$")
    public void IsItNotAWeekend(String date) throws Exception {
        if(DateTimeUtils.isWeekend(date))
            throw new Exception("Today is weekend");
    }


    @And("^It is not a public holiday (.*)$")
    public void IsItNotAPublicHoliday(String date) throws Exception {
        if(DateTimeUtils.isHoliday(date))
            throw new Exception("Today is holiday");
    }

    @Then("^I Check if the meeting is created as expected Note title (.*) time (.*) duration (.*) people (.*)$")
    public void iCheckIfTheMeetingIsCreatedAsExpectedNote(String title, String time, String duration, String contact) {
        homePage().viewMeetingNote(title);
        mettingDialogPage().verifyMeetingNote(title, time, duration, contact);
    }
}
