package com.company;

import java.util.ArrayList;

public class PhD {
    private String name;
    private int year;
    private int month;
    private int day;
    private PhD advisor1;
    private PhD advisor2;
    private ArrayList<PhD> advisees;
    PhD(String myName,int myYear,int myMonth,int myDay){
        name=myName;
        year = myYear;
        month = myMonth;
        day=myDay;
        advisor1 = null;
        advisor2 = null;
        advisees = new ArrayList<PhD>();
    }
    PhD(String myName,int myYear,int myMonth,int myDay,PhD myAdvisor1){
        name=myName;
        year = myYear;
        month = myMonth;
        day=myDay;
        advisor1 = myAdvisor1;
        advisor1.addAdvisee(this);
        advisor2 = null;
        advisees = new ArrayList<PhD>();
    }
    PhD(String myName,int myYear,int myMonth,int myDay,PhD myAdvisor1,PhD myAdvisor2){
        name=myName;
        year = myYear;
        month = myMonth;
        day = myDay;
        advisor1 = myAdvisor1;
        advisor1.addAdvisee(this);
        advisor2 = myAdvisor2;
        advisor2.addAdvisee(this);
        advisees = new ArrayList<PhD>();
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return name;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int newMonth){
        this.month = newMonth;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int newDay){
        this.day = newDay;
    }
    public int getDay(){
        return day;
    }
    public void setAdvisor1(PhD newAdvisor1){
        advisor1 = newAdvisor1;
        advisor1.addAdvisee(this);
    }
    public PhD getAdvisor1(){
        return advisor1;
    }
    public void setAdvisor2(PhD newAdvisor2){
        advisor2 = newAdvisor2;
        advisor2.addAdvisee(this);
    }
    public PhD getAdvisor2(){
        return advisor2;
    }
    public void addAdvisee(PhD newAdvisee){
        if (!advisees.contains(newAdvisee)){
            advisees.add(newAdvisee);
        }
    }
    public void removeAdvisee(PhD advisee){
        advisees.remove(advisee);
    }
    public ArrayList<PhD> getAdvisees(){
        return advisees;
    }
    public void sayAdvisees(){
        String sayString = new String("My advisees are ");
        if(advisees.size()==1){
            sayString = "My advisee is ";
        }else if(advisees.size()<1){
            sayString = "I have no advisees";
        }
        for(int i=0;i<advisees.size();i++){
            if(i==0){
                sayString += advisees.get(i).getName();
            }else if(advisees.size()-i==1){
                if(advisees.size()==2){
                    sayString+=" and "+advisees.get(i).getName();
                }else{
                    sayString+=", and "+advisees.get(i).getName();
                }
            }else{
                sayString+=", "+advisees.get(i).getName();
            }
        }
        System.out.println(sayString);
    }
    public void kickAdvisor1(){
        if(advisor1!=null) {
            advisor1.removeAdvisee(this);
            advisor1 = advisor2;
            advisor2 = null;
        }
    }
    public void kickAdvisor2(){
        if (advisor2!=null){
            advisor2.removeAdvisee(this);
            advisor2 = null;
        }
    }
    public String toString(){
        MonthDayYear myMonthDayYear = new MonthDayYear();
        if (advisor1==null){
            return "Hi! my name is "+name+". I got my PhD on " +myMonthDayYear.tellMeDate(month,day,year)+". I have "+advisees.size()+ " advisees";
        }else if (advisor2==null){
            return "Hi! my name is "+name+". I got my PhD on " +myMonthDayYear.tellMeDate(month,day,year)+". My advisor is "+ advisor1.getName()+" and I have "+advisees.size()+ " advisees";
        }else{
            return "Hi! my name is "+name+". I got my PhD on " +myMonthDayYear.tellMeDate(month,day,year)+". My advisors are "+ advisor1.getName()+" and "+advisor2.getName()+" and I have "+advisees.size()+ " advisees";
        }

    }

}