package P014_L011_Airplane;

    public class CY_27 extends AirplaneControl implements AirplaneControlInterface {

        int speed;
        String color;

        public CY_27(int length, int width, int weight, int speed, String color) {
            super(length, width, weight);
            this.speed = speed;
            this.color = color;
        }

        public void speedPlane (){
            System.out.println("The plane is flying: " + speed + " km per hour");
        }

        @Override
        public void turboAcceleration() {
            int turboAcceleration = (int) ((Math.random() * ((speed+500) - speed)) + speed);
            System.out.println("Turbo Acceleration Speed = " + turboAcceleration + " km per hour");
        }

        @Override
        public void stealthTechnology() {
            int time = (int) ((Math.random() * (60 - 10)) + 10);
            System.out.println("the plane will not be visible after " + time + " minutes");
        }

        @Override
        public String toString() {
            return "CY_27{" +
                    "speed=" + speed +
                    ", color='" + color +
                    ", Length " + getLength() +
                    ", Width "+ getWidth() +
                    ", Weight " + getWeight() +
                    '}';
        }

        @Override
        public void nuclearStrike() {
            int nuclearNumber = (int) ((Math.random() * (10 - 1)) + 1);
            System.out.println(nuclearNumber + " nuclear warheads will be dropped");


        }




    }
}
