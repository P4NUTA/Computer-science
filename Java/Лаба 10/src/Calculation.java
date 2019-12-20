public class Calculation implements Runnable {
    private int id;
    private double time;

    public Calculation(int id, double time) {
        this.id = id;
        this.time = time;
    }

    @Override
    public void run() {
        double passedTime = 0;
        while (true) {
            if (ThreadExample.currentCalculation == 0) ThreadExample.currentCalculation = this.id;
            if (ThreadExample.currentCalculation == this.id) {
                passedTime += 0.5;
                System.out.print(".");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (passedTime >= this.time) {
                ThreadExample.currentCalculation = 0;
                System.out.println("\nCalculation #" + this.id + " finished!");
                break;
            }
        }
    }
}
