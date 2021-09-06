/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise04.solution04;

/*Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.*/

import java.util.Scanner;

public class Application {
    /*
    create a program that prompts for four inputs
    read in the four inputs provided
    store the inputs
     uses the inputs to add to a pre-created template
     */
    public static void main(String[] args) {
        System.out.println("Enter a noun: ");

        Scanner myObj = new Scanner(System.in);
        String Name;

        System.out.println("Enter a verb: ");

        Scanner myObj2 = new Scanner(System.in);
        String Name2;

        System.out.println("Enter an adjective: ");

        Scanner myObj3 = new Scanner(System.in);
        String Name3;

        System.out.println("Enter an adverb: ");

        Scanner myObj4 = new Scanner(System.in);
        String Name4;


        Name = myObj.nextLine();
        Name2 = myObj.nextLine();
        Name3 = myObj.nextLine();
        Name4 = myObj.nextLine();

        System.out.println("Do you " +  Name2 + " your "
                +  Name3 +(" ") + Name + (" ") + Name4 + "? That's hilarious!");
    }
}