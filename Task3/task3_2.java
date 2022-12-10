// Дан массив двоичных чисел [1,1,0,0,1,1,1] Вывести максимальное число подряд идущих
package Seminars.Task3;

public class task3_2 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 };
        int count = 1;
        int max_count = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            if ((array[i] == 1) & (array[i] == array[i + 1])) {
                count++;
                if (max_count < count) {
                    max_count = count;
                }
            }

            else {
                count = 1;
            }
        }
        System.out.print(max_count);
    }
}
