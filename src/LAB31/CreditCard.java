package LAB31;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreditCard implements PayStrategy {
    private static final Map<String, String> DATA = new HashMap<>();
    private String password, email;
    boolean signedIn;
    Scanner in = new Scanner(System.in);

    static {
        DATA.put("1234", "123456789");
    }

    CreditCard(int amount) {
        pay(amount);
    }

    @Override
    public boolean pay(int amount) {
        collectDetails();
        if (signedIn) {
            System.out.println("Paying " + amount + " using card");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectDetails() {

        System.out.print("Enter the number of credit card: ");
        email = in.nextLine();
        System.out.print("Enter the pin-code: ");
        password = in.nextLine();
        if (verify()) {
            System.out.println("Data verification has been successful");
        } else {
            System.out.println("Wrong pin-code or number of card!");
        }
    }

    @Override
    public boolean verify() {
        signedIn = email.equals(DATA.get(password));
        return signedIn;
    }
}
