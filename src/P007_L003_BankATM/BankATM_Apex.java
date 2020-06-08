package ATMVitalii;

    import java.util.Scanner;

public class BankATM_Apex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        boolean work = true;
        int transactionIndex = 0;
        String[] transaction1 = new String[20];
        int[] transaction2 = new int[10];
        int[] transaction3 = new int[10];
        System.out.println("Welcome to ATM Apex Bank!");
        System.out.println("");
        while (work) {
            System.out.println("Press 1 to see your balance");
            System.out.println("Press 2 to add money");
            System.out.println("Press 3 to get money");
            System.out.println("Press 4 to Exit");

            String operation = sc.next();
            switch (operation) {
                case "1": {
                    System.out.println("Your balance is: "+balance+"\n");
                    break;
                }
                case "2": {
                    System.out.print("How match would you like to add? ");
                    int addMoney = sc.nextInt();
                    balance +=addMoney;
                    if (transactionIndex < transaction2.length){
                        transaction1[transactionIndex] = "add Money";
                        transaction2[transactionIndex] = addMoney;
                        transaction3[transactionIndex] = balance;
                        transactionIndex++;}
                    System.out.println("Transaction was successful");
                    System.out.println("Your current balance is: "+balance+"\n");
                    break;
                }
                case "3": {
                    System.out.println("Your current balance is: "+balance);
                    System.out.print("How match would you like to get? ");
                    int withdraw = sc.nextInt();
                    if (withdraw<=balance){
                        balance -= withdraw;
                        if (transactionIndex < transaction2.length){
                            transaction1[transactionIndex] = "withdraw";
                            transaction2[transactionIndex] -= withdraw;
                            transaction3[transactionIndex] = balance;
                            transactionIndex++;}
                        System.out.println("Transaction was successful");
                        System.out.println("Your balance is: "+balance+"\n");
                    }else
                        System.out.println("You have not enough money for withdraw: "+ withdraw +" Because of your balance is: "+balance+"\n");
                    break;
                }

                case "4": {
                    System.out.println("Exit was successful!");
                    work = false;
                    break;
                }
                default: {
                    System.out.println("Input is incorrect. Please, try again");
                }
            }
        }
        sc.close();

    }
    }


