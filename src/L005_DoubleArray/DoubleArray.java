package L005_DoubleArray;

public class DoubleArray {
    public static void main(String[] args) {

        // Create double array:
        System.out.println("Double array:");
        int [][] doubleArrayNumbers = new int[5][5];
        doubleArrayNumbers [2][3] = 100;

        for (int w = 0; w < doubleArrayNumbers.length; w++) {
            for (int e = 0; e < doubleArrayNumbers.length; e++) {
                System.out.print(doubleArrayNumbers[w][e] + "     ");
            }
            System.out.println();   // створює рядки / переводить нас в наступну стрічку
        }



//        // Create "multiplication table" using double array:
//        System.out.println("Double array:");
//        int [][] doubleArrayNumbers = new int[10][10];
//
//        for (int w = 1; w < doubleArrayNumbers.length; w++) {
//            for (int e = 1; e < doubleArrayNumbers.length; e++) {
//                doubleArrayNumbers [w][e] = w * e;
//                System.out.print(doubleArrayNumbers[w][e] + "   ");
//            }
//            System.out.println();   // створює рядки / переводить нас в наступну стрічку
//        }



    }
}
