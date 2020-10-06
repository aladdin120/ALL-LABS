package LAB10;

import java.util.Scanner;

public class Task3 {
    public static String recursion(int N) {

        if (N < 10)
            return Integer.toString(N);
        else
            return recursion(N / 10) + " " + N % 10;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        System.out.print("N: "); N = in.nextInt();
        System.out.println(recursion(N));
    }
}