package com.company;
import java.util.Scanner;

public class Main {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

        int x = 5;
        int y = 10;

        System.out.println("Your favourite number: ");

        if(userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();

            System.out.println("You entered: " + numberEntered);
        }
        else
        {
            System.out.println("Enter Integer next time man!");
        }


    }

}
