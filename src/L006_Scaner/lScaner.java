package L006_Scaner;

import java.util.Scanner;

public class lScaner {
    public static void main(String[] args) {

        System.out.println("Please, type something:");

        Scanner sc = new Scanner(System.in);   // To put here "Alt"+"Enter" to create "import java.util.Scanner;"
        String userInput = sc.next();   // Here we stop our program until user will put some input
        System.out.println("You typed: " + userInput);
    }
}