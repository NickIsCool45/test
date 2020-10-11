package com.company;

public class voweldetector {
    public static void main(String[] args) {

    }
    public boolean findVowels(String text){
        String vowels[] = {"a","e","i","o","u","A","E","I","O","U"};
        Boolean isTrue = false;
        for(int i=0; i< vowels.length;i++){
            isTrue = text.contains(vowels[i]);
            if(isTrue == true){
                break;
            }
        }
        return isTrue;
    }
}
