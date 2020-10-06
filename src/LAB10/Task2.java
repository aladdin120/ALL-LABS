package LAB10;

import java.util.Scanner;

public class Task2 {
    public static int recursion(int a, int b) {

        if (a > b + 1)
            return 0;

        if (a == 0)
            return 1;

        if (a == 1)
            return b + 1;

        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("a: "); a = in.nextInt();
        System.out.print("b: "); b = in.nextInt();
        System.out.println(recursion(a, b));
    }
}
