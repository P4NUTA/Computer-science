public class FourthClass {
    public static void main(String[] args) {
        // 10 point
        int p = 0;
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                double d = (double) i / 4;
                System.out.print(d + "; "); // вывод в одну строку
            }
        }
        System.out.println();
        int year = 2016;
        switch (year) {
            case 2014:
                System.out.println("You're 3rd year student");
                break;
            case 2015:
                System.out.println("You're 2nd year student");
                break;
            case 2016:
                System.out.println("You're 1st year student");
                break;
        }
        // 11 point
        System.out.println("\tx1\tx2\tx3\tf");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    // Быдло объявления (чтобы цифры выводить)
                    int x1 = i;
                    int x2 = j;
                    int x3 = k;
                    int f;
                    boolean f1, f2, f3;
                    // булевые значения (true/false)
                    f1 = x1 == 1;
                    f2 = x2 == 1;
                    f3 = x3 == 1;
                    // проверка на истинност логич. элементов
                    if (f1 && f2 || !f3) {
                        f=1;
                    }
                    else f=0;
                    // вывод
                    System.out.println("\t" + x1 + "\t" + x2 + "\t" + x3 + "\t" + f);
                }
            }
        }
        // 12 point
        for (int i=0;i<130;i++){
            if (i%7==0) // Проверка что число кратно 7
                System.out.println(i);
            if (i >= 69) // Остановка
                break;
        }
    }
}
