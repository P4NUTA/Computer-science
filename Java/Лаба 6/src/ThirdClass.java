import java.util.Arrays;

public class ThirdClass {
    public static void main(String[] args) {
        // 8 point
        double[] arr = {0.5, 1.3, 2.7, 0.2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
        System.out.println(arr.length);
        // 9 point
        String s1 = "Peter Piper picked a peck of pickled peppers";
        String[] stringArray = s1.split(" ");
        System.out.println(Arrays.toString(stringArray)); // Вывод массива
        System.out.println(stringArray[5]); // Вывод 5ого элемента
        Arrays.sort(stringArray); // Сортировки массива
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.binarySearch(stringArray,"peppers")); // Поиск элемента (массив, слово)
    }
}