package P014_L011_Airplane;

    package java_core.lesson_13_Airplane;

    public abstract class Plane {
        //    Створити Абстрактний клас Літак який матиме такі методи:
//    startEngines(), який буде виводити на екран скільки часу залишилось до готовності вилетіти, де час генерується випадково в межах від [20,88];
//    takeoffPlane(), який скільки пролетить літак кілометрів на повному баку палива. Генеруємо випадкове число від 0 до 1000;
//    landingPlane(), який виводить на екран що літак іде на посадку;
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
