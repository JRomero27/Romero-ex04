package exercise04;


/*
 *  UCF COP3330 Fall 2021 Exercise 4 Solution
 *  Copyright 2021 Joshua Romero
 */

import java.util.Scanner;

public class solution04 {
    public static void main(String[] args) {

        System.out.println("Enter a noun: ");

        Scanner input = new Scanner(System.in);
        String textN = input.next();

        System.out.println("Enter a verb: ");

        Scanner inputTwo = new Scanner(System.in);
        String textV = inputTwo.next();

        System.out.println("Enter an Adjective: ");

        Scanner inputThree = new Scanner(System.in);
        String textAj = inputThree.next();

        System.out.println("Enter an adverb: ");

        Scanner inputFour = new Scanner(System.in);
        String textAv = inputFour.next();

        System.out.println("Do you " + textV + " your " + textAj + " " + textN + " " + textAv + "? That's hilarious!" );

    }
}
