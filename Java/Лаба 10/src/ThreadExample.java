public class ThreadExample {
    volatile static int currentCalculation;

    public static void main(String[] args) {
        Thread calc1 = new Thread(new Calculation(1, 3.5));
        calc1.start();
        Thread calc2 = new Thread(new Calculation(2, 5.5));
        calc2.start();
    }
}