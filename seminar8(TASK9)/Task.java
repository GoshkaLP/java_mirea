package seminar8;

import java.util.*;

public class Task {
    protected static String Mercury =  "Mercury";
    protected static String Venus = "Venus";
    protected static String Earth = "Earth";
    protected static String Mars = "Mars";
    protected static String Jupiter = "Jupiter";
    protected static String Saturn = "Saturn";
    protected static String Uranus = "Uranus";
    protected static String Neptune = "Neptune";

    public static void main(String[] args) {
        // Создадим первый спискок планет
        List<String> arr1 = new ArrayList<String>(Arrays.asList(Mercury, Venus, Earth, Mars, Jupiter, Uranus, Neptune));
        // Создадим второй список (не модифицируемый)
        List<String> arr2 = Collections.unmodifiableList(arr1);
        // Сразу проитерируемся по элементам второго списка, так как больше нам с ним делать нечего
        System.out.println("Elements of Unmodifiable List:");
        for (String s : arr2) {
            System.out.println(s);
        }
        System.out.println();

        // Добавим планету в первый список
        arr1.add(Saturn);
        // Удалим планету из первого списка
        arr1.remove(Mars);
        // Изменим одна планету на другую в первом списке
        arr1.set(arr1.indexOf(Mercury), Mars);
        // Выведем на экран элементы первого списка с индексами
        System.out.println("Elements of first list:");
        for (int i = 0; i < arr1.size(); ++i) {
            System.out.println("Index: " + String.valueOf(i) + ", Value: " + arr1.get(i));
        }
        System.out.println();

        // Теперь перемешаем элементы
        Collections.shuffle(arr1);
        // И снова выведем на экран элементы
        System.out.println("Elements of first list after shuffle:");
        for (String s: arr1) {
            System.out.println(s);
        }
        System.out.println();

        // Проверим наличие элемента в списке
        if (arr1.contains(Mercury)) {
            System.out.println(Mercury + " is in list");
        } else {
            System.out.println(Mercury + " is not in list");
        }

        // Выберем случайную планету из массива
        Random random = new Random();
        int randomPlanetIndex = random.nextInt(arr1.size());
        System.out.println("Random planet from first list is " + arr1.get(randomPlanetIndex));
    }
}
