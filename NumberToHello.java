import java.util.Scanner;

public class NumberToHello {
    public static void hello () {
        int valueToHello = 7;
        int addedNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не число");
            sc.next();
        }
        addedNumber = sc.nextInt();

        if (addedNumber > valueToHello)
            System.out.println("Привет");
        else if (addedNumber == valueToHello)
            System.out.println(addedNumber + " = 7");
        else System.out.println(addedNumber + " меньше 7"); }

    }



