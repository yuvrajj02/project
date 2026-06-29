package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand =new Random();
        this.number =rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println(" Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean isCorrectNumber(){
        if (inputNumber==number){
            return true;
        }
        else if (inputNumber>number){
            System.out.println("too high ...");
        } else if (inputNumber<number) {
            System.out.println("too low ... ");
        }
        return false;

    }

}

public class guess_game {
    public static void main(String[] args) {
        Game game = new Game();
        boolean b=false;
        while (!b) {
            game.takeUserInput();
            b = game.isCorrectNumber();
            System.out.println(b);
        }


    }
}
