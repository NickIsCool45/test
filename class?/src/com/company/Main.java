package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MonthDayYear chatterbox = new MonthDayYear();
        PhD bob = new PhD("Bob",2016,5,16);
        PhD joe = new PhD("joe",1916,5,16,bob);
        PhD bil = new PhD("Bil",1816,5,16,joe,bob);
        System.out.println(bob);
        System.out.println(joe);
        System.out.println(bil);
        /*voweldetector myVowelDetector = new voweldetector();

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
