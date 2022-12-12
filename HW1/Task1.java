package HW1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
        // чисел от 1 до n)
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();

        System.out.printf("Треугольное число для " + n + " равно: " + (n * (n + 1)) / 2);
        in.close();
    }

}
