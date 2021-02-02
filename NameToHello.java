import java.util.Scanner;

public class NameToHello {
    public static void stringEquals() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String a = sc.nextLine();
        String b = "Вячеслав";
        if (a.equals(b)) System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    }
}
