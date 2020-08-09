package P012_L009_Robot;

public class Main {
    public static void main(String[] args) {
        System.out.println("Створити в Main класі екземпляри вищеописаних класів і викликати до кожного з них\n" +
                "метод work:");

        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();

        robot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCooker.work();

        System.out.println("\n" + "Створити в Main класі масив класу Robot, заповнити масив екземплярами вищеописаних\n" +
                "класів:");

        Robot[] robotMass =  {robot,coffeeRobot,robotDancer,robotCooker};

        for (int i = 0; i <robotMass.length ; i++) {
            robotMass[i].work();
        }
    }
}