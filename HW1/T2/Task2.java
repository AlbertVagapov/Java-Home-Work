package HW1.T2;

public class Task2 {
    public static void main(String args[]) {
        onethousandsimpledigits(1000, 1000);

    }

    public static void onethousandsimpledigits(int x, int y) {
        int counter = 0;
        while (counter < y) {
            if (simple(x)) {
                System.out.println("i = " + x);
                counter++;
            }
            x++;
        }
    }

    public static boolean simple(int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}