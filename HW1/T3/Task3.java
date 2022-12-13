package HW1.T3;

import java.util.Scanner;

public class Task3 {

    private static Scanner read;

    public static void main(String[] args) {

        read = new Scanner(System.in);

        double first;
        double second;
        String operator;

        System.out.print(">> ");

        first = read.nextDouble();
        operator = read.next();
        second = read.nextDouble();

        if (operator.equals("*")) {
            System.out.println("= " + (first * second));
        }
        if (operator.equals("/")) {
            System.out.println("= " + (first / second));
        }
        if (operator.equals("+")) {
            System.out.println("= " + (first + second));
        }
        if (operator.equals("-")) {
            System.out.println("= " + (first - second));
        }
    }
}
