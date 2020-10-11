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
    }
}
