import java.util.Scanner;

public class MultipleToThree {
    public static void arrayOfMultipleNumbers() {
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


    }
}
