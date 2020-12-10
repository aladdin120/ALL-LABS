package LAB31;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class elWallet implements PayStrategy {

    private static final Map<String, String> DATA = new HashMap<>();
    private String password, email;
    boolean signedIn;
    Scanner in = new Scanner(System.in);

    static {
        DATA.put("qwerty", "star1354@mail.ru");
    }

    elWallet(int amount) {
        pay(amount);
    }

    @Override
    public boolean pay(int amount) {
        collectDetails();
        if (signedIn) {
            System.out.println("Paying " + amount + " using wallet");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectDetails() {

        System.out.print("Enter the user's email: ");
        email = in.nextLine();
        System.out.print("Enter the password: ");
        password = in.nextLine();
        if (verify()) {
            System.out.println("Data verification has been successful");
        } else {
            System.out.println("Wrong email or password!");
        }
    }

    @Override
    public boolean verify() {
        signedIn = email.equals(DATA.get(password));
        return signedIn;
    }
}
