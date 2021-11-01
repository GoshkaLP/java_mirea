package seminar7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        Random random = new Random();

        int key;
        for (int i = 0; i < 50; ++i) {
            key = random.nextInt(10);
            if (hashmap.containsKey(key)) {
                hashmap.put(key, hashmap.get(key) + 1);
            } else {
                hashmap.put(key, 0);
            }
        }

        int val;
        for (Integer key2: hashmap.keySet()) {
            val = hashmap.get(key2);
            System.out.println(key2 + ": " + val);
        }
    }
}
