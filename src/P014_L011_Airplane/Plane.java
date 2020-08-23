package P014_L011_Airplane;

    package java_core.lesson_13_Airplane;

    public abstract class Plane {

        public void startEngines (){
            int startEnginTime = (int) ((Math.random() * 100);
            System.out.println(startEnginTime + " minutes left to fly out");
        }
        public void takeoffPlane (){
            int takeoffPlaneDistance = (int) ((Math.random() * 100);
            System.out.println("The plane will fly: " + takeoffPlaneDistance + " km on a full tank of fuel");
        }
        public void landingPlane (){
            System.out.println("The plane is landing");
        }

    }
}
