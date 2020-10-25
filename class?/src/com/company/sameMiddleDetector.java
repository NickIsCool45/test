package com.company;

public class sameMiddleDetector {
    public boolean detectSameMiddles(String whatToProcess){
        boolean reply = false;
        if (whatToProcess.length()%2>0){
            reply = true;
        }else{
            char middle = whatToProcess.charAt(whatToProcess.length()/2-1);
            char middlePlus = whatToProcess.charAt(whatToProcess.length()/2);
            reply=(middle==middlePlus);
        }
        return reply;
    }
}
