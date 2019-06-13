package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second){

        if(first >= 10 && second >= 10){
            int i = 0;
            int greatestCommon = 0;
            while(i < first){
                i++;
                if(first%i == 0 && second%i == 0){
                    greatestCommon = i;
                }
            }
            return greatestCommon;
        }

        return -1;
    }
}
