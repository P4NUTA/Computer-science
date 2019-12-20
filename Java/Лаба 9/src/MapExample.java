import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new
                HashMap<>();
        Map<String, Integer> treeMap = new
                TreeMap<>();
        Map<String, Integer> linkedHashMap = new
                LinkedHashMap<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int val = random.nextInt(50);
            hashMap.put("k" + i, val);
            treeMap.put("k" + i, val);
            linkedHashMap.put("k" + i, val);
        }
        // вывод контейнеров
        System.out.println(hashMap);
        System.out.println(treeMap);
        System.out.println(linkedHashMap);
        // получение значений по ключу
        System.out.println("Let's compare first elements:" + hashMap.get("k0") + " | " + treeMap.get("k0") + " | " + linkedHashMap.get("k0"));
        // проверка наличия ключа
        System.out.println("Is key k30 presented? " + hashMap.containsKey("k30"));
        // проверка наличия значения
        System.out.println("Is value 23 presented? " + treeMap.containsValue(23));
        // получить множество ключей контейнера
        System.out.println("Keys: " + linkedHashMap.keySet());
        // получить множество значений контейнера
        System.out.println("Values: " + hashMap.values());
    }
}
