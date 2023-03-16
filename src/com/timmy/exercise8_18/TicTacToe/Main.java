package com.timmy.exercise8_18.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Booard booard = new Booard();
    private Plaayer plaayer1 = new Plaayer(Maark.X);
    private Plaayer plaayer2 = new Plaayer(Maark.O);
    public static void main(String[] args) {
        startTicTacToe();

    }
    private static void startTicTacToe(){
        displayBooard();
        prompt("""
                Select an option
                1. play with human
                2. play with computer
                3. exit""");
       try {
           int option = scanner.nextInt();
           switch (option){
               case 1:playWithHuman();
               case 2:playWithComputer();
               case 3:exit(3);
               default:{ prompt("invalid input, select a valid option ");
                   startTicTacToe();
               }
           }
       }catch (InputMismatchException e){
           prompt("Enter a valid option");
           scanner.nextLine();
           startTicTacToe();
       }
    }

    private static void playWithComputer() {
    }

    private static void playWithHuman() {
    }

    private static void prompt(String message){
        System.out.println(message);
    }
    private static void displayBooard(){
        booard.displayBooardSurface();
    }
}
