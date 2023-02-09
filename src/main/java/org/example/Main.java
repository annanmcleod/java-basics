package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Open the Door");

        Scanner in = new Scanner(System.in);

        String answer = "open sesame";
        String userInput;
        Integer attempts = 0;


        while (attempts < 3) {
            System.out.print("> ");
            userInput = in.nextLine();
            if (userInput.equals(answer)) {
                System.out.println("The door is unlocked!");
                break;
            } else {
                attempts++;
            }
        }
        if (attempts == 3) {
            System.out.println("The door is locked");
        }
    }
}
