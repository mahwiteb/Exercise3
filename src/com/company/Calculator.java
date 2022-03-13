package com.company;

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;


public class Calculator {

    public static void main(String[] args) throws  IOException {

    float firstNumberBlessing , secondNumberBlessing , sum , substraction , product , quotient ;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum , difference, product and quotient for two numbers.");
        System.out.println("Enter the first number (press Enter): ");
        firstNumberBlessing = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number ( press enter )");
        secondNumberBlessing = Float.parseFloat(br.readLine());

        sum = firstNumberBlessing + secondNumberBlessing ;
        substraction = firstNumberBlessing - secondNumberBlessing ;
        product =firstNumberBlessing * secondNumberBlessing ;
        quotient = firstNumberBlessing / secondNumberBlessing ;

        System.out.printf("You entered two numbers , the first is:  "+ "%2.2f" ,firstNumberBlessing);
        System.out.printf(" and the seconf is:  "+ "%2.2f",secondNumberBlessing);

        System.out.println();

        System.out.printf("Sum = "+ "%2.2f , \n", + sum);
        System.out.printf("Difference = " + "%2.2f, \n" ,+ substraction);
        System.out.printf("Product = " + "%2.2f , \n" , + product);
        System.out.printf("Qoutient = " + "%2.2f , \n", + quotient);




    }
}
