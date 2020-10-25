package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sameMiddleDetector sameMiddleMachine = new sameMiddleDetector();
        if(sameMiddleMachine.detectSameMiddles("addc")){
            System.out.println("It is true!");
        }else{
            System.out.println("It is not!");
        }
        /*MysteryNumberComparer mysteryNumberMachine = new MysteryNumberComparer();
        System.out.println(mysteryNumberMachine.doMysteryStuffWithMyNumbers(3,2,false));
        MonthDayYear chatterbox = new MonthDayYear();
        PhD bob = new PhD("Bob",2016,5,16);
        PhD joe = new PhD("joe",1916,5,16,bob);
        PhD bil = new PhD("Bil",1816,5,16,joe,bob);
        bob.setAdvisor1(bob);
        bob.setAdvisor2(bil);
        joe.setAdvisor2(bil);
        bil.setAdvisor1(bil);
        System.out.println(bob);
        System.out.println(joe);
        System.out.println(bil);
        bob.sayAdvisees();
        voweldetector myVowelDetector = new voweldetector();

        if(myVowelDetector.findVowels("YTHRWQ")){
            System.out.println("Yay it is not mindless!");
        }else{
            System.out.println("Oh Dear");

        }
        DoubleEDetector myEEdetector = new DoubleEDetector();
        if(myEEdetector.findDoubleEs("Is this mindless? I dont know")){
            System.out.println("Yay it is not mindless!");
        }else{
            System.out.println("Oh Dear");

        }
        System.out.println(chatterbox.tellMeDate(10,89898981,2020));*/

    }
}
