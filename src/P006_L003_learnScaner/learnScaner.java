package P006_L003_learnScaner;

import java.util.Scanner;

public class learnScaner {
    public static void main(String[] args) {

        System.out.println("Please, type something:");

        Scanner sc = new Scanner(System.in);   // To put here "Alt"+"Enter" to create "import java.util.Scanner;"
        String userInput = sc.next();   // Here we stop our program until user will put some input
        System.out.println("You typed: " + userInput);
    }
}