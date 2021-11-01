package seminar7;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        Cat cat = new Cat("John", false, 10, 5);
        Dog dog = new Dog("Alex", false, 32, 20);
        Owl owl = new Owl("Sovunya", true, 40, 10);

        Owl owl2 = new Owl("Lina", true, 60, 7);
        Owl cat2 = new Owl("Josh", false, 10, 8);

        Map<String, Pet> hashmap = new HashMap<String, Pet>();

        hashmap.put(cat.getName(), cat);
        hashmap.put(dog.getName(), dog);
        hashmap.put(owl.getName(), owl);
        hashmap.put(owl2.getName(), owl2);
        hashmap.put(cat2.getName(), cat2);

        for (String key: hashmap.keySet()) {
            Pet val = hashmap.get(key);
            System.out.println(val);
        }
    }
}
