package com.company;

public class MonthDayYear {
    public static void main(String[] args) {

    }
    public String tellMeDate(int month, int day, int year){
        String months[] = {"January","February","March","April","May","June","July",
                "August","September","October","November","December"};
        String dayEnding = new String("th");
        String dayEndings[]={"st","nd","rd"};
        if (day<10||day>19){
            if (day%10<4){
                dayEnding = dayEndings[day%10-1];
            }
        }
        String fullString = new String(months[month-1]+" "+day+dayEnding+", "+year);
        return fullString;
    }
}
