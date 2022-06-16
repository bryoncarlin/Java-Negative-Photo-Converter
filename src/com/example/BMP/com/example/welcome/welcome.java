package com.example.BMP.com.example.welcome;

import com.example.BMP.BMP;

import java.io.IOException;
import java.util.Scanner;




public class welcome {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int choice = -1;
        printMenu();
        choice = scan.nextInt();
        while (choice != 3) {
            switch (choice) {


                case 1:
                    System.out.println("Please check your folder for the negative photo");
                    BMP.main(args);

                    break;
                case 2:
                    System.out.println("If your photo is not turned into a negative still please double check the path in the BMP.java or contact Bryon");
                    break;
                default:
                    System.out.println("Invalid");
            }
            printMenu();
            choice = scan.nextInt();

        }
        System.out.println("Thanks for using");
    }

    public static void printMenu() {
        System.out.println("Pick one of the options:\n"
                + "1) Turn photo into negative \n"
                + "2) Help \n"
                +  "3) Exit");

    }
}