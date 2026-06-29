package com.company;
import java.util.Scanner;
import java.util.Random;
public class rock_ppr_scisor {
    public static void main(String[] args) {

        System.out.println("ROCK PAPER SCISSOR");

        Random comp = new Random();
        Scanner sc = new Scanner(System.in);

        int userScore = 0;
        int compScore = 0;

        System.out.println("    RULES !!!    ");
        System.out.println("0 for rock ; 1 for paper ; 2 for scissor ");

        for ( int i = 0 ; i<3 ; i++){
            System.out.print("Enter 0 , 1 , 2 to play : ");
            int user = sc.nextInt();
            int computer = comp.nextInt(3);


            if (user < 0 || user > 3){
                System.out.println(" INVALID ENTRY ");
                break;
            }
            System.out.println(" user entered: "+ user + " and computer enter: " + computer);

            if ( user == computer ){
                System.out.println(" TIE ");

            } else if ((user == 0 && computer == 2)|| (user == 1 && computer == 0 )|| (user == 2 && computer == 1)) {
                System.out.println("user win");
                userScore = userScore+1;


            }
            else {
                System.out.println("computer win ");
                compScore = compScore+1;
            }
        }
        if (userScore == compScore){
            System.out.println("TIE");

        } else if (userScore > compScore) {
            System.out.println("USER WIN ");


        }
        else {
            System.out.println("COMPUTER WIN");
        }

    }
}
