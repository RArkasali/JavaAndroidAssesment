package com.calendar.pageobjects;

public class NewMeetingPagePO {
    public String[] txtTitle = new String[] {"id","org.withouthat.acalendar:id/title"};
    public String[] lnkContact = new String[] {"id","org.withouthat.acalendar:id/contactLink"};
    public String[] cbDuration = new String[] {"id","org.withouthat.acalendar:id/duration"};
    public String[] selectDuration30Minute = new String[] {"xpath","//android.widget.RelativeLayout/android.widget.TextView[@text='30 minutes']"};
    public String[] save = new String[] {"id","org.withouthat.acalendar:id/action_save"};
    public String[] searchContact = new String[] {"id","com.samsung.android.app.contacts:id/search_src_text"};
    public String[] selectContact = new String[] {"xpath","//android.widget.TextView[@text='%s']"};
    public String[] cbAllDay = new String[] {"id","org.withouthat.acalendar:id/alldayCB"};
    public String[] startDay = new String[] {"id","org.withouthat.acalendar:id/startDate"};
    public String[] selectDate = new String[] {"xpath","//android.view.View[contains(@content-desc,'%s')][contains(@content-desc,'%s')]"};
    public String[] acceptButton = new String[] {"id","org.withouthat.acalendar:id/mdtp_ok"};
}
