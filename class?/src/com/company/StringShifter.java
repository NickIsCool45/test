package com.company;

public class StringShifter {
    public String shiftThisString(String whatToShift, int howManySteps){
        String shiftedString = new String();
        for(int i=0;i<whatToShift.length();i++){
            if(whatToShift.charAt(i)>'A'&&whatToShift.charAt(i)<'Z'&&whatToShift.charAt(i)-howManySteps<65){
                shiftedString+=(char)(whatToShift.charAt(i)+26-howManySteps);
            }else if(whatToShift.charAt(i)>'a'&&whatToShift.charAt(i)<'z'&&whatToShift.charAt(i)-howManySteps<97){
                shiftedString+=(char)(whatToShift.charAt(i)+26-howManySteps);
            }else{
                shiftedString+= (char)(whatToShift.charAt(i) - howManySteps);
            }
        }
        return shiftedString;
    }
}
