package com.company;

import java.util.Scanner;

public class simple_calc {
    public static void main(String[] args) {

        // calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator ");

        System.out.print("Enter First Number : ");
        System.out.println();
        int num1=sc.nextInt();

        System.out.print("Enter Second Number : ");
        System.out.println();
        int num2 = sc.nextInt();

        System.out.println("Operation You Want to perform ");
        System.out.println("1. for sum " +
                "2. for subtract " +
                "3. for multiply" +
                "4. for quotient " +
                "5. for remainder " +
                "6. for exponent");
        int operator = sc.nextInt();

        switch (operator){
            case 1:
                System.out.println("Sum of "+num1+ " and "+ num2 + " is : "+ num1+num2);
                break;

            case 2:
                int difference = num1-num2;
                System.out.println("Difference of "+num1+ " and "+ num2 + " is : "+ difference);
                break;
            case 3:
                System.out.println("Product of "+num1+ " and "+ num2 + " is : "+ num1*num2);
                break;
            case 4:
                System.out.println("Quotient of "+num1+ " divide by "+ num2 + " is : "+ num1/num2);
                break;
            case 5:
                System.out.println("Reaminder of "+num1+ " divide by "+ num2 + " is : "+ num1%num2);
                break;
            case 6:
                System.out.println(num1+" raised to power "+ num2+ " is "+Math.pow(num1,num2));
                break;
            default:
                System.out.println("invalid input !!");
        }
        System.out.println("MORE COMING SOON...");


    }
}
