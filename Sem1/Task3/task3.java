// Дан массив двоичных чисел [1,1,0,0,1,1,1] Вывести максимальное число подряд идущих

package Seminars.Task3;

public class task3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 1, 1, 1, 1, 0, 1 };
        int findn = 1; // цисло которое нужно найти
        int count = 0;
        int countmax = 0;
        int maxlenghtArray = arr.length - 1;
        for (int i : arr) {
            if (findn == i) {
                count += 1;
                if (maxlenghtArray == 0) {
                    if (count >= countmax) {
                        countmax = count;
                    }
                    count = 0;
                }
            } else {
                if (count >= countmax) {
                    countmax = count;
                }
                count = 0;
            }
            maxlenghtArray -= 1;
        }
        System.out.println(countmax);
    }

}
