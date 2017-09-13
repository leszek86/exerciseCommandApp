package com.company;
import java.util.Scanner;

public class Main {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String ContYorN = "Y";

        int h = 1;

        while(ContYorN.equalsIgnoreCase("y"))
        {
            System.out.println(h);
            System.out.println("Continue y or n?");
            ContYorN = userInput.nextLine();
            h++;
        }
;    }

}
