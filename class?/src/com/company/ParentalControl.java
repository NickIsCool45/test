package com.company;

public class ParentalControl {
    public String parentsGetControl(String input){
        String output = new String();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='a'&& input.charAt(i)<='z'){
                output+=Character.toUpperCase(input.charAt(i));
                output+=input.charAt(i);
            }
            else{
                output += input.charAt(i);
            }
        }
    return output;
    }
}
