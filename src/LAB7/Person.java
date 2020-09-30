package LAB7;

import java.util.ArrayList;
import java.util.Scanner;

public class Person extends FurnitureShop{

    ArrayList<Furniture> cart = new ArrayList<Furniture>();

    FurnitureShop shop = new FurnitureShop();

    public void addWish() {
        shop.get_info();
        String wish;
        int number;

        System.out.println("What product should I add to cart?\n");
        Scanner input = new Scanner(System.in);
        wish = input.nextLine();
        System.out.println("How much to add?");
        number = input.nextInt();

        switch (wish) {
            case "Bed": {
                bed.setAmount(number);
                cart.add(bed);
                break;
            }

            case "Table": {
                table.setAmount(number);
                cart.add(table);
                break;
            }

            case "Sofa": {
                sofa.setAmount(number);
                cart.add(sofa);
                break;
            }
        }
    }

    public void getCart() {
        System.out.println("Cart:");
        int money = 0;
        for(int i = 0; i < cart.size(); i++) {
            money += (cart.get(i)).getPrice();
            System.out.println((cart.get(i)).getC());
        }
        System.out.println("Total amount: "+money+"\n");
    }
}
