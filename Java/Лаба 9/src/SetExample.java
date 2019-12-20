import java.util.*; // импорт всех библиотек пакета java.util

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int val = random.nextInt(50);
            hashSet.add(val);
            treeSet.add(val);
            linkedHashSet.add(val);
        }
        // вывод контейнеров
        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);
        // проверка наличия элемента
        System.out.println("Is 5 presented? " +
                hashSet.contains(5));
        // получение значений контейнера
        System.out.println("Let's compare first elements: " + hashSet.iterator().next() + " | " + treeSet.iterator().next() + " | " + linkedHashSet.iterator().next());
    }
}