package com.calendar.utils;

import com.calendar.constants.PropertyConstants;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeUtils {
    public enum UTC {
        UTC10;

        @Override
        public String toString(){
            if (this == UTC.UTC10) {
                return "UTC+7";
            }
            return "Please define it";
        }
    }

    private static final String DEFAULT_DATE_FORMAT = "yyyy/MM/dd";
    private static DateTimeFormatter dtf;

    private static String getCurrentDateDueToUTC() {
        Date date = new Date();
        dtf = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
        LocalDateTime localDate;
        localDate = date.toInstant().atZone(ZoneId.of(UTC.UTC10.toString())).toLocalDateTime();
        return localDate.format(dtf);
    }

    /*
        get current date Sydney
     */

    public static String getCurrentDateSydney(){
        return getCurrentDateDueToUTC();
    }

    /*
        is weekend
        date is format "yyyy-MM-dd"
     */

    public static boolean isWeekend(String date){
        dtf = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
        LocalDate localDate = LocalDate.parse(date, dtf);
        return localDate.getDayOfWeek() == DayOfWeek.SATURDAY || localDate.getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    /*
        define a list holiday in calendar properties
        each date spit by comma
     */

    public static boolean isHoliday(String date){
        String holiday = ReadPropertiesFile.GetProperty(PropertyConstants.HOLIDAY);
        return holiday.contains(date);
    }

     /*
        define a list holiday in calendar properties
        each date spit by comma
        date is format "yyyy/M/d"
     */

    public static String addOneDay(String date){
        dtf = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
        LocalDate localDate = LocalDate.parse(date, dtf);
        LocalDate now = localDate.plusDays(1);
        return dtf.format(now);
    }
}
