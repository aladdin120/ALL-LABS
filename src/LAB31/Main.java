package LAB31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choise, amount;
        Scanner in = new Scanner(System.in);
        System.out.println("How do you want to pay?\nCredit card - 1\nWallet - 2");
        choise = in.nextInt();
        System.out.println("Enter amount:\t");
        amount = in.nextInt();
        if (choise == 1) {
            CreditCard card = new CreditCard(amount);
        } else {
            elWallet wallet = new elWallet(amount);
        }
    }
}
