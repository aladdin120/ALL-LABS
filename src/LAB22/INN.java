package LAB22;

import java.util.Scanner;

public class INN {


    public void Request() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО и ИНН\nИНН состоит из 8 цифр");
        String fio = in.nextLine();
        String inn = in.nextLine();

        try {
            if(!inn.matches("\\d{8}"))
                throw new IllegalArgumentException("Данный ИНН не действителен");
            System.out.printf("Покупка совершена успешно, %s!", fio);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
