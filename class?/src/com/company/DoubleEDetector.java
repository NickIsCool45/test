package com.company;

public class DoubleEDetector {
    public static void main(String[] args) {

    }
    public boolean findDoubleEs(String text){
        int numberOfEs = 0;
        for(int i=0;i<text.length();i++){
            if (text.charAt(i)== 'e' || text.charAt(i)== 'E'){
                numberOfEs++;
            }
        }
        return (numberOfEs>=2);
    }
}
