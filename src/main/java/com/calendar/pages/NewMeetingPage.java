package com.calendar.pages;

import com.calendar.base.BasePOM;
import com.calendar.pageobjects.NewMeetingPagePO;
import com.calendar.utils.DateTimeUtils;
import com.calendar.utils.DeviceActionUtils;
import io.appium.java_client.MobileElement;

public class NewMeetingPage extends BasePOM {
    NewMeetingPagePO newMeetingPage = new NewMeetingPagePO();
    DeviceActionUtils deviceActionUtils = new DeviceActionUtils(getDriver());

    public void setTitle(String title){
        appHelper().captureScreenShots();
        appHelper().enterTextWithKeyPad(newMeetingPage.txtTitle[0], newMeetingPage.txtTitle[1], title);
    }

    public void setDay(String date){
        // due to issue click need to add one more day to select correctly
        String newDate = DateTimeUtils.addOneDay(date);

        String[] days = "/".split(newDate);
        appHelper().captureScreenShots();
        appHelper().clickByElement(newMeetingPage.startDay[0], newMeetingPage.startDay[1]);

        appHelper().scrolltoElementAndClick(newMeetingPage.selectDate[0],
                String.format(newMeetingPage.selectDate[1], days[2], days[1] + " " + days[0]));
        appHelper().clickByElement(newMeetingPage.acceptButton[0], newMeetingPage.acceptButton[1]);
    }

    public void selectContact(String contact){
        deviceActionUtils.verticalSwipeByPercentages(0.5, 0.8, 0.2);
        appHelper().captureScreenShots();
        appHelper().clickByElement(newMeetingPage.lnkContact[0], newMeetingPage.lnkContact[1]);

        appHelper().captureScreenShots();
        appHelper().enterTextWithKeyPad(newMeetingPage.searchContact[0], newMeetingPage.searchContact[1], contact);

        appHelper().captureScreenShots();
        appHelper().clickByElement(newMeetingPage.selectContact[0], String.format(newMeetingPage.selectContact[1], contact));
    }

    /*
        Set duration is hour unit
        If it is day, turn off
     */

    public void selectDuration(String duration){
        deviceActionUtils.verticalSwipeByPercentages(0.5, 0.4, 0.2);
        MobileElement cbAllDay = appHelper().getMobileElements(newMeetingPage.cbAllDay[0], newMeetingPage.cbAllDay[1]).get(0);
        if(cbAllDay.isSelected())
            appHelper().clickByElement(newMeetingPage.cbAllDay[0], newMeetingPage.cbAllDay[1]);

        if(duration.equals("30")) {
            appHelper().clickByElement(newMeetingPage.cbDuration[0], newMeetingPage.cbDuration[1]);
            appHelper().scrollToElement(newMeetingPage.selectDuration30Minute[0], newMeetingPage.selectDuration30Minute[1]);
            appHelper().captureScreenShots();
            appHelper().clickByElement(newMeetingPage.selectDuration30Minute[0], newMeetingPage.selectDuration30Minute[1]);
        }
    }

    public void saveMeeting(){
        appHelper().captureScreenShots();
        appHelper().clickByElement(newMeetingPage.save[0], newMeetingPage.save[1]);
    }
}
