package P011_L008_Human;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, put your Name");
            String name = scanner.next();
            System.out.println("Please, put: '1' if you are the 'Picker' type or '2' if you are 'Hunter' type");
            int type = scanner.nextInt();
            System.out.println("Please, put your Age");
            int age = scanner.nextInt();

        Human human = new Human (name, type, age);

        String[] pickerMenu = new String[]{"0. potato", "1. broccoli", "2. avocado"};
        String[] hunterMenu = new String[]{"0. turkey", "1. beef", "2. chicken"};

        int id;

        System.out.println(human);
        System.out.println("Food liked:");

        if (human.getType().equals("Picker")) {
            for (int i = 0; i < pickerMenu.length; i++) {
                System.out.println(pickerMenu[i]);
            }
            System.out.println("Choose one food:");
            id = scanner.nextInt();
            human.setFood(pickerMenu[id]);
            human.getFood();
        }
        if (human.getType().equals("Hunter")) {
            for (int i = 0; i < hunterMenu.length; i++) {
                System.out.println(hunterMenu[i]);
            }
            System.out.println("Choose one food:");
            id = scanner.nextInt();
            human.setFood(hunterMenu[id]);
            human.getFood();
        }

    }
}