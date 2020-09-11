import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static int factorial(int n){
        int fact = 1; int num=1;
        do{
            fact *=num;
            num++;
        } while(num != n+1);
        return fact;
    }

    public static void main(String[] args) {
        int sum1=0;
        int [] array1 = new int [20];
        int [] array2 = new int [20];
        final Random random = new Random();

        System.out.println("Массив, созданный с помощью метода random():");
        for (int i = 0; i<20; i++){
            array1[i] = (int) (Math.random() * 1001);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("\nОтсортированный массив, созданный с помощью метода random():");
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i<20; i++){
            sum1 += array1[i];
        }
        System.out.println("\nСумма массива с помощью цикла for: "+sum1);
        int j = 0; sum1 = 0;
        while(j != 20) {
            sum1 += array1[j];
            j++;
        }
        System.out.println("\nСумма массива с помощью цикла while: "+sum1);
        j = 0; sum1=0;
        do {
            sum1 += array1[j];
            j++;
        } while (j != 20);
        System.out.println("\nСумма массива с помощью цикла do while: "+sum1);

        System.out.println("\nМассив, созданный с помощью Класса Random:");
        for (int i = 0; i<20; i++){
            array2[i] = random.nextInt(1001);
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("\nОтсортированный массив, созданный с помощью класса Random:");
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        System.out.println("\n3! = "+factorial(3)+"\n");
        System.out.println("14! = "+factorial(14)+"\n");
    }
}
