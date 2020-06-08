package P004_L003_ArrayCreateFindCalculateSort;

public class ArrayCreateFindCalculateSort {

    public static void main(String[] args) {


        // Create an int array of any length:
        System.out.println("An int array:");
        int [] anyNameNumbers = {12, 4, 3, 25, 22, 1};

        for (int w = 0; w < anyNameNumbers.length; w++) {
            System.out.print(anyNameNumbers[w] + "; ");
        }
        System.out.println("");   //just to have "enter" space



        // Find the largest even number:
        int maxEvenNumber = 0;
        for (int w = 0; w < anyNameNumbers.length; w++) {
            if (anyNameNumbers[w] %2 == 0  &&  anyNameNumbers[w] > maxEvenNumber)
                maxEvenNumber = anyNameNumbers[w];
        }
        System.out.println("The largest even number:");
        System.out.println(maxEvenNumber);



        // Find the largest odd number:
        int maxOddNumber = 0;
        for (int w = 0; w < anyNameNumbers.length; w++) {
            if (anyNameNumbers[w] %2 > 0  &&  anyNameNumbers[w] > maxOddNumber)
                maxOddNumber = anyNameNumbers[w];
        }
        System.out.println("The largest odd number");
        System.out.println(maxOddNumber);



        // Calculate the sum of all even numbers:
        int sumAllEvenNumbers = 0;
        for (int w = 0; w < anyNameNumbers.length; w++) {
            if (anyNameNumbers[w] %2 == 0)
                sumAllEvenNumbers += anyNameNumbers[w];
        }
        System.out.println("The sum of all even numbers:");
        System.out.println(sumAllEvenNumbers);



        // Calculate the sum of all odd numbers:
        int sumAllOddNumbers = 0;
        for (int w = 0; w < anyNameNumbers.length; w++) {
            if (anyNameNumbers[w] %2 > 0)
                sumAllOddNumbers += anyNameNumbers[w];
        }
        System.out.println("The sum of all odd numbers:");
        System.out.println(sumAllOddNumbers);




        // Sort array "manually":
        // int [] anyNameNumbers = {12, 4, 3, 25, 22, 1};

        for (int w = 0; w < anyNameNumbers.length; w++) {   // "int w = 0;" - go to first index, which has number "2" inside in  our example; "w++" each time after operation add one index, so go to next index; "w < anyNameNumbers.length;" - make sure our index is not more than our maximum (the last) index;
            for (int e = w + 1; e < anyNameNumbers.length; e++) {   // "int e = w + 1;" - to compare two indexes, we should create "e" which is just some other index (not first), so let go the next ("e = w + 1")
                if (anyNameNumbers[w] > anyNameNumbers [e]) {  // here we are compering two indexes to get result "true"/"false". If we will want to sort from big number to small, we can just change to "<".
                    int num = anyNameNumbers[w];   // (!) very important part: we are creating "int num" to make a reserve copy of number from the index pointed by [w]
                    anyNameNumbers[w] = anyNameNumbers [e];   // if [w]>[e] is "true", than the program will change the number in [w], so: we had "{12, 4, ...}", and now: "{4, 4, ...}"
                    anyNameNumbers [e] = num;   // in previous operation we lost our number 12. But we saved reserve cope of it by creating "int num". So here we assign to [e] that number.
                }
            }
        }
        System.out.println ("After sorting manually:");
        for (int w = 0; w < anyNameNumbers.length; w++) {
            System.out.print(anyNameNumbers[w] + " ");
        }
        System.out.println("");   //just to have "enter" space



        // Sort array "using class Arrays.sort":
        // int [] anyNameNumbers = {12, 4, 3, 25, 22, 1};
//        Arrays.sort(anyNameNumbers);
//        System.out.println ("After sorting:");
//        for (int w = 0; w < anyNameNumbers.length; w++) {
//            System.out.print(anyNameNumbers[w] + " ");
//        }



    }
}
