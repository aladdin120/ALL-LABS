package LAB18;

import java.util.Scanner;

public class Tasks {

    public void FirstTask(int num, int del) {
        if(del > num/2) {
            System.out.printf("%d ", num);
            return;
        }

        if(num % del == 0) {
            System.out.printf("%d ", del);
            FirstTask(num/del, del);
        } else {
            FirstTask(num, ++del);
        }
    }

    public void SecondTask(String name) {
        StringBuilder reverse = new StringBuilder(name);
        reverse.reverse();
        if(name.equals(reverse.toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public int ThirdTask() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num == 0)
            return 0;
        else
            return Math.max(num, ThirdTask());
    }

    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        Scanner in = new Scanner(System.in);
        int num; String text;

        System.out.println("Task one\nInsert a number: ");
        num = in.nextInt();
        System.out.printf("Multipliers of the number %d:\n", num);
        tasks.FirstTask(num, 2);
        System.out.println("\n\nTask two\nInsert a word: ");
        text = in.next();
        System.out.printf("Is the world \"%s\" a palindrome?\n", text);
        tasks.SecondTask(text);
        System.out.println("\nThird Task\nInsert numbers:");
        num = tasks.ThirdTask();
        System.out.println("Max: "+num);
        in.close();
    }
}
