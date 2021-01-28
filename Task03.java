import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер (количество элементов) массива: ");
        int size = sc.nextInt();
        int[] ints = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) ints[i] = sc.nextInt();

        System.out.println("Элементы, кратные 3: ");
        for (int a : ints) {
            if (a % 3 == 0)
                System.out.println(a);
                        }
        sc.close();
    }
}
