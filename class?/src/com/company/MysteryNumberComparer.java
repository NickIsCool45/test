package com.company;

public class MysteryNumberComparer {
    public int doMysteryStuffWithMyNumbers(int num1,int num2, boolean whatToDo){
        int result = 0;
        if (whatToDo){
            result = num1+num2;
        }else{
            result = num1-num2;
        }
        return result;
    }
}
