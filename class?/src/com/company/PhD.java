package com.company;

public class PhD {
    private String name;
    private int year;
    private int month;
    private int day;
    private PhD advisor1;
    private PhD advisor2;
    private int advisees;
    PhD(String myName,int myYear,int myMonth,int myDay){
        name=myName;
        year = myYear;
        month = myMonth;
        day=myDay;
        advisor1 = null;
        advisor2 = null;
        advisees = 0;
    }
    PhD(String myName,int myYear,int myMonth,int myDay,PhD myAdvisor1){
        name=myName;
        year = myYear;
        month = myMonth;
        day=myDay;
        advisor1 = myAdvisor1;
        advisor1.setAdvisees(advisor1.getAdvisees()+1);
        advisor2 = null;
        advisees=0;
    }
    PhD(String myName,int myYear,int myMonth,int myDay,PhD myAdvisor1,PhD myAdvisor2){
        name=myName;
        year = myYear;
        month = myMonth;
        day = myDay;
        advisor1 = myAdvisor1;
        advisor1.setAdvisees(advisor1.getAdvisees()+1);
        advisor2 = myAdvisor2;
        advisor2.setAdvisees(advisor2.getAdvisees()+1);
        advisees=0;
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
        advisor1.setAdvisees(advisor1.getAdvisees()+1);
    }
    public PhD getAdvisor1(){
        return advisor1;
    }
    public void setAdvisor2(PhD newAdvisor2){
        advisor2 = newAdvisor2;
        advisor2.setAdvisees(advisor2.getAdvisees()+1);
    }
    public PhD getAdvisor2(){
        return advisor2;
    }
    public void setAdvisees(int newAdvisees){
        advisees = newAdvisees;

    }
    public int getAdvisees(){
        return advisees;
    }
    public void kickAdvisor1(){
        advisor1.setAdvisees(advisor1.getAdvisees()-1);
        advisor1 = advisor2;
        advisor2 = null;
    }
    public void kickAdvisor2(){
        advisor2.setAdvisees(advisor2.getAdvisees()-1);
        advisor2 = null;
    }
    public String toString(){
        MonthDayYear myMonthDayYear = new MonthDayYear();
        if (advisor1==null){
            return "Hi! my name is "+name+". I got my PhD on " +myMonthDayYear.tellMeDate(month,day,year)+". I have "+advisees+ " advisees";
        }else if (advisor2==null){
            return "Hi! my name is "+name+". I got my PhD on " +myMonthDayYear.tellMeDate(month,day,year)+". My advisor is "+ advisor1.getName()+" and I have "+advisees+ " advisees";
        }else{
            return "Hi! my name is "+name+". I got my PhD on " +myMonthDayYear.tellMeDate(month,day,year)+". My advisors are "+ advisor1.getName()+" and "+advisor2.getName()+" and I have "+advisees+ " advisees";
        }

    }

}