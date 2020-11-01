package com.company;

public class MysteryNumberComparer {
    public double doMysteryStuffWithMyNumbers(double num1,double num2, int taskNumber){
        double result = 0;
        int whatToDo = taskNumber%10;
        switch (whatToDo){
            case 1:
                result = num1+num2;
                break;
            case 2:
                result = num1-num2;
                break;
            case 3:
                result = num2-num1;
                break;
            case 4:
                result = num1*num2;
                break;
            case 5:
                result = num1/num2;
                break;
            case 6:
                result = num2/num1;
                break;
            case 7:
                result = Math.pow(num1,num2);
                break;
            case 8:
                result = Math.pow(num2,num1);
                break;
            case 9:
                result = Math.PI*num1*num2;
                break;
            case 0:
                result = Math.toRadians(num1*num2);
                break;
        }
        return result;
    }
}
