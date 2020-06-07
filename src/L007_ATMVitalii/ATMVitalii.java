package ATMVitalii;

    import java.util.Scanner;

public class ATMVitalii {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        boolean work = true;
        int transactionIndex = 0;
        String[] transaction1 = new String[20];
        int[] transaction2 = new int[10];
        int[] transaction3 = new int[10];
        System.out.println("Welcome to ATM");
        while (work) {
            System.out.println("Press 1 to see your balance");
            System.out.println("Press 2 to add money");
            System.out.println("Press 3 to get cash");
            System.out.println("Press 4 to Exit");

            String operation = sc.next();
            switch (operation) {
                case "1": {
                    System.out.println("Your balance is: "+balance+"\n");
                    break;
                }
                case "2": {
                    System.out.print("How match you would like add? ");
                    int addMoney = sc.nextInt();
                    balance +=addMoney;
                    if (transactionIndex < transaction2.length){
                        transaction1[transactionIndex] = "add Money";
                        transaction2[transactionIndex] = addMoney;
                        transaction3[transactionIndex] = balance;
                        transactionIndex++;}
                    System.out.println("Transaction is successful");
                    System.out.println("Your balance is: "+balance+"\n");
                    break;
                }
                case "3": {
                    System.out.println("Your balance is: "+balance);
                    System.out.print("How match you would like get? ");
                    int withdraw = sc.nextInt();
                    if (withdraw<=balance){
                        balance -= withdraw;
                        if (transactionIndex < transaction2.length){
                            transaction1[transactionIndex] = "withdraw";
                            transaction2[transactionIndex] -= withdraw;
                            transaction3[transactionIndex] = balance;
                            transactionIndex++;}
                        System.out.println("Transaction is successful");
                        System.out.println("Your balance is: "+balance+"\n");
                    }else
                        System.out.println("You have not enough money for withdraw: "+ withdraw +" Because of your balance is: "+balance+"\n");
                    break;
                }

                case "4": {
                    System.out.println("Have a nice Day!");
                    work = false;
                    break;
                }
                default: {
                    System.out.println("You did wrong input. Try again");
                }
            }
        }
        sc.close();

    }
    }


