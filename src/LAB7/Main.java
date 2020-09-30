package LAB7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        int num = -1;

        while (num != 3) {
            System.out.println("What do you want?\n1 - add wish to cart\n2 - see cart\n3 - exit");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            switch (num) {

                case 1: {
                    person.addWish();
                    break;
                }

                case 2: {
                    person.getCart();
                    break;
                }

                case 3: {
                    System.out.println("See you then!");
                }
            }
        }

    }
}
