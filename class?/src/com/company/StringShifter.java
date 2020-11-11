package com.company;

public class StringShifter {
    public String shiftThisString(String whatToShift, int howManySteps){
        String shiftedString = new String();
        for(int i=0;i<whatToShift.length();i++){
            if(whatToShift.charAt(i)>='A'&&whatToShift.charAt(i)<='Z'&&(whatToShift.charAt(i)-howManySteps%26<65||whatToShift.charAt(i)-howManySteps%26>90)){
                if(whatToShift.charAt(i)-howManySteps>90){
                    shiftedString+=(char)(whatToShift.charAt(i)-26-howManySteps%26);
                }else{
                    shiftedString+=(char)(whatToShift.charAt(i)+26-howManySteps%26);
                }
            }else if(whatToShift.charAt(i)>='a'&&whatToShift.charAt(i)<='z'&&(whatToShift.charAt(i)-howManySteps%26<97||whatToShift.charAt(i)-howManySteps%26>122)){
                if(whatToShift.charAt(i)-howManySteps>122){
                    shiftedString+=(char)(whatToShift.charAt(i)-26-howManySteps%26);
                }else{
                    shiftedString+=(char)(whatToShift.charAt(i)+26-howManySteps%26);
                }
            }else{
                shiftedString+= (char)(whatToShift.charAt(i) - howManySteps%26);
            }
        }
        return shiftedString;
    }
}
