package com.abolfazl_sadeghian.CalendarDateDemo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDateDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        System.out.println("Today : "+ sdf.format(currentDate));

        int day = currentDate.getDay();
        int month = currentDate.getMonth();
        int year = currentDate.getYear();

        Date abolfazlBirthday = new Date(1985,02,21);
        System.out.println("Abolfazl Birthday is: "+sdf.format(abolfazlBirthday));

        System.out.println(year+" " +month+" " +day);

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = new GregorianCalendar();
        Date currentDate2 = calendar.getTime();
        System.out.println("Today: "+sdf2.format(currentDate2));

        calendar.set(1985,02,21);
        Date abolfazlBirthday2 = calendar.getTime();
        System.out.println("Abolfazl birthda2 : "+sdf2.format(abolfazlBirthday2));

        int day2 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day: "+day2);
        int month2 = calendar.get(Calendar.MONTH);
        System.out.println("Month: "+month2);
        int year2 = calendar.get(Calendar.YEAR);
        System.out.println("Year: "+ year2);


        LocalDateTime currentTime4 = LocalDateTime.now();
        System.out.println("Current date time is 4 :"+ currentTime4);
        LocalDate today = currentTime4.toLocalDate();
        System.out.println("Today 4: "+ today);

        LocalDate abolfazlBD = LocalDate.of(1985, Month.FEBRUARY,21);
        System.out.println("Abolfazl Birthday 4: "+ abolfazlBD);

        int day4 = abolfazlBD.getDayOfMonth();
        int month4=abolfazlBD.getMonthValue();
        int year4= abolfazlBD.getYear();

        System.out.println("Day 4: "+day4+"\nMonth 4: "+month4+"\nYear 4: "+year4);


    }
}
