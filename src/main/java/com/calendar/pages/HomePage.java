package com.calendar.pages;

import com.calendar.base.BasePOM;
import com.calendar.pageobjects.HomePagePO;
import com.calendar.utils.AssertHelper;

public class HomePage extends BasePOM {
    HomePagePO homePage = new HomePagePO();

    public void clickOnSkipButton() {
        appHelper().captureScreenShots();
        appHelper().clickByElement(homePage.skipButton[0], homePage.skipButton[1]);
    }

    public void clickOnStartButton() {
        appHelper().captureScreenShots();
        appHelper().clickByElement(homePage.startButton[0], homePage.startButton[1]);
    }

    public void acceptPhoneContactAndCalendar(){
        appHelper().captureScreenShots();
        appHelper().clickByElement(homePage.allowAccessContactButton[0], homePage.allowAccessContactButton[1]);
        appHelper().captureScreenShots();
        appHelper().clickByElement(homePage.allowCalendarButton[0], homePage.allowCalendarButton[1]);
    }

    public void createNewMeeting(){
        appHelper().captureScreenShots();
        appHelper().clickByElement(homePage.addNewMeeting[0], homePage.addNewMeeting[1]);
    }

    public void viewMeetingNote(String meeting) {
        appHelper().captureScreenShots();
        appHelper().clickByElement(homePage.checkMeeting[0], String.format(homePage.checkMeeting[1], meeting));
    }
}
