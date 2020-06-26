package P008_L005_GameGuessNumber;

import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * 100);
        //System.out.println("random = " + random);

        System.out.println("Let's start the Game");
        System.out.println("Guess a number from 0 to 100 in 10 attempts");

        for (int attempt = 1; attempt <= 10; attempt++) {
            System.out.print("Your number:" + attempt + ":");
            int userAnswer = sc.nextInt();
            if (userAnswer == random) {
                System.out.println("");
                System.out.println("Congratulations! You guessed in attempt: " + attempt + " of 10 attempts");
                break;
            }
            if (userAnswer > random) {
                System.out.println("Let's try lower number");
            }
            if (attempt <= 10 && userAnswer < random) {
                System.out.println("Let's try greater number");
            }
            if (attempt == 10 && userAnswer != random) {
                System.out.println("Sorry, you didn't guessed, my number was:" + random);
            }

        }
    }
}
