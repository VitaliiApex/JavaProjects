package P003_L002_DisplayNumbersInConsoleByCycle;

public class DisplayNumbersInConsoleByCycle {

    public static void main(String[] args) {

        System.out.println("Display the numbers 1 to 10 in the console through cycle");

        int circleCounter = 1;
        do {
            System.out.println( + circleCounter);
            circleCounter = circleCounter + 1;
        } while (circleCounter <= 10);

    }
}
