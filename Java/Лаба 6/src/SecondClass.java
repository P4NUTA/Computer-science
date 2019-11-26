public class SecondClass {
    public static void main(String[] args) {
        // 5 point
        String s = "13.7";
        Double a = new Double(s);
        char c = "qwe".charAt(2); // символ со 2-й позиции
        System.out.println(a);
        System.out.println(c);
        // 6 point
        String se = "135";
        Integer iS = new Integer("135");
        System.out.println(iS);
        iS = new Integer(se);
        System.out.println(iS);
        // 7 point
        String s1 = "Java is one if the best languages!";
        String s2 = "Java is one of the most beautiful languages!";
        System.out.println(s1.charAt(5)); // Символ на 5ой позиции
        System.out.println(s2.compareTo(s1)); // Сравнение строк
        System.out.println(s1.indexOf("best")); // Поиск слова
    }
}
