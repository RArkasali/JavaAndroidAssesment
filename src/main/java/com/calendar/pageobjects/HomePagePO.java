package com.calendar.pageobjects;

public class HomePagePO {
    public String[] skipButton = new String[] {"id","org.withouthat.acalendar:id/skip"};
    public String[] startButton = new String[] {"id","org.withouthat.acalendar:id/finish"};
    public String[] allowAccessContactButton = new String[] {"id","com.android.permissioncontroller:id/permission_allow_button"};
    public String[] allowCalendarButton = new String[] {"id","com.android.permissioncontroller:id/permission_allow_button"};
    public String[] addNewMeeting = new String[] {"id","org.withouthat.acalendar:id/menu_add"};
    public String[] checkMeeting = new String[] {"xpath","//android.widget.TextView[contains(@content-desc,'%s')]"};

}
