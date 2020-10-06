package LAB10;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k, s, count = 0;
        System.out.print("K: "); k = in.nextInt();
        System.out.print("S: "); s = in.nextInt();

        int i = (int) Math.pow(10, k-1);
        while (i < (int)Math.pow(10, k)) {
            int sum = 0, num = i;

            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum == s)
                count++;
            i++;
        }
        System.out.println(count);
    }
}