package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
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

    }
}
