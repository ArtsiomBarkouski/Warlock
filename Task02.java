import java.util.Scanner;

import static java.lang.System.in;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String a = sc.nextLine();
        sc.close();
        String b = "Вячеслав";
        if (a.equals(b)) System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    }
}
