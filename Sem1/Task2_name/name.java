package Seminars\Sem1\Task2_name\name.java;

import java.util.Scanner;

/**
 * name
 */
public class name {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = myScan.nextLine();
        System.out.printf("Hello, %s!", name);
        myScan.close();
    }
}