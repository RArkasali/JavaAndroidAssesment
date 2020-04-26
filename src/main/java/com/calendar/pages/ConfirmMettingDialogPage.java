package com.calendar.pages;

import com.calendar.base.BasePOM;
import com.calendar.pageobjects.ConfirmMeetingDialogPO;
import com.calendar.utils.AssertHelper;

public class ConfirmMettingDialogPage extends BasePOM {
    ConfirmMeetingDialogPO meetingDialog = new ConfirmMeetingDialogPO();

    public void verifyMeetingNote(String title, String time, String duration, String contact) {
        String content = appHelper().getTextByLocator(meetingDialog.title[0], meetingDialog.title[1]);
        AssertHelper.assertTrue(content.equals(title));

        content = appHelper().getTextByLocator(meetingDialog.time[0], String.format(meetingDialog.time[1], time));
        AssertHelper.assertTrue(content.contains(time));
        AssertHelper.assertTrue(content.contains(duration));

        AssertHelper.assertTrue(appHelper().isElementDisplayed(meetingDialog.selectContact[0], String.format(meetingDialog.selectContact[1], contact.toUpperCase())));

    }
}
