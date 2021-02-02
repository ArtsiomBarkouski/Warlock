import java.util.Scanner;

public class NameToHello {
    public static void stringEquals() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        while (!sc.hasNextLine()) {
            System.out.println("Вы ввели не имя");
            sc.next();
        }
        String addedLine = sc.nextLine();
        String availableString = "Вячеслав";
        if (addedLine.equals(availableString)) System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    }
}
