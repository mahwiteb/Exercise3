package com.company;

import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculator {
    public static void main(String[] args) throws IOException {


        float heightBlessing  , weightBlessing , bmiBlessing ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program will calculate your BMI ");
        System.out.println("Enter your height in cm (and press Enter ):  ");
        heightBlessing = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight ( and press Enter): ");
        weightBlessing = Float.parseFloat(br.readLine());

        bmiBlessing = (float) (weightBlessing / (Math.pow(heightBlessing, 2)));
        System.out.printf("Your BMI is : "  + "%2.2f, \n" , bmiBlessing);

        if (bmiBlessing <16 ){
            System.out.println("Your are starving");
        } else if ((bmiBlessing>=16)&& (bmiBlessing < 16.99)){
            System.out.println("You´re emaciated");
        } else if ((bmiBlessing>=17)&&(bmiBlessing<18.49)) {
            System.out.println("You´re underweight");
        } else if ((bmiBlessing>=18.50)&&(bmiBlessing < 22.99)) {
            System.out.println("You are in the low range of the norm");
        } else if ((bmiBlessing >= 23)&& (bmiBlessing< 24.99)) {
            System.out.println("You´re in the high range of the norm");
        } else if ((bmiBlessing>= 25)&& (bmiBlessing < 27.49)) {
            System.out.println("You are overweight (pre-obese");
        }  else if ((bmiBlessing>= 27.50)&& (bmiBlessing < 29.99)) {
            System.out.println("You are overweight ");
        }  else if ((bmiBlessing>= 30)&& (bmiBlessing < 34.99)) {
            System.out.println("You have 1st degree obesity");
        }  else if ((bmiBlessing>= 35)&& (bmiBlessing < 39.99)) {
            System.out.println("You have 2nd degree obesity");
        }  else if ((bmiBlessing> 40)) {
            System.out.println("You have 3rd degree obesity");
        }



    }
}
