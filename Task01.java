import java.util.Scanner;

public class Task01 {
    public static void hello () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        int b = 7;

        if (a > b)
            System.out.println("Привет");
        else if (a == b)
            System.out.println(a + "= 7");
        else System.out.println(a + " меньше 7");
    }
    public static void main(String[] args) {
        Task01.hello();
        Task02.stringEquals();
        Task03.arrayOfMultiple();
    }


}
