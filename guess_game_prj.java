package com.company;

import java.util.Random;
import java.util.Scanner;

public class guess_game_prj {
    public static void main(String[] args) {
        // guess game using loop and conditional statements

        Scanner sc = new Scanner(System.in);
        //Random rand = new Random();

        int generatedNumber = new Random().nextInt(100);
        int count=0;

        System.out.println("Guess NUmber Between 1 and 100");

        while(true){
            System.out.print("Guess Number : \n");
            int guessNumber = sc.nextInt();

            if(guessNumber>generatedNumber){
                System.out.println("Guess Number is Large ");
                System.out.println("Guess Again ");
                count++;
            }
            else if ( guessNumber<generatedNumber) {
                System.out.println("Guess Number is small ");
                System.out.println("Guess Again ");
                count++;

            }
            else {
                System.out.println("Correct Number !!");
                count++;
                System.out.print("Attempts Taken to Guess : "+count);
                break;
            }
        }
    }
}
