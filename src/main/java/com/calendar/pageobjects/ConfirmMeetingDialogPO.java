package com.calendar.pageobjects;

public class ConfirmMeetingDialogPO {
    public String[] title = new String[] {"id","org.withouthat.acalendar:id/details_title"};
    public String[] time = new String[] {"xpath","//android.widget.TextView[contains(@content-desc,'%s')]"};
    public String[] selectContact = new String[] {"xpath","//android.widget.TextView[@text='%s']"};

}
