package Sem3;

import java.util.ArrayList;

public class programm {
    public static void Task() {
        ArrayList<String> my_array = new ArrayList<String>();
        my_array.add("Меркурий");
        my_array.add("Земля");
        my_array.add("Венера");
        my_array.add("Юпитер");
        my_array.add("Нептун");
        my_array.add("Солнце");
        my_array.add("Нептун");
        /*
         * ArrayList<String> my_array2 = new ArrayList<String>();
         * StringBuilder stringBuilder = new StringBuilder();
         * for(String text : my_array) {
         * if (!my_array2.contains(text)) {
         * //my_array.stream().filter(i -> Objects.equals(i, text)).count() (прост
         * подумал зачем два for)
         * System.out.println(text + ": " + my_array.stream().filter(i ->
         * Objects.equals(i, text)).count());
         * }
         * my_array2.add(text);
         * }
         * my_array = (ArrayList<String)
         * my_array.stream().distinct().collect(Collectors.toList());
         * System.out.println(my_array);
         */
        System.out.println(countNamesPlanetAndReturnNotRepeatNamesPlanet(my_array));

    }

    // считает название планет и возращает неповторяющиейся имена планет
    public static ArrayList<String> countNamesPlanetAndReturnNotRepeatNamesPlanet(ArrayList<String> arr) {
        ArrayList<String> my_array = new ArrayList<String>();
        for (int i = 0; i < arr.size(); i++) {
            int count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j).equals(arr.get(i))) { // сверяем меркурий с меркурием, меркурий с землей и тд, потом
                                                     // земля с меркурием и так далее
                    count += 1;
                }
            }
            if (!my_array.contains(arr.get(i))) { // проверяем если планета уже в списке чтоб меркурий 2 раза не
                                                  // повторялся по типу Меркурий: 2, Меркурий: 2
                System.out.println(arr.get(i) + ": " + count); // Вывод
                my_array.add(arr.get(i)); // Записываем в список чтоб не повторялось "не повторялся по типу Меркурий: 2,
                                          // Меркурий: 2"
            }
        }
        return my_array; // возращаем список
    }
}
