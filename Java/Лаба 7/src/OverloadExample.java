// 9 point
public class OverloadExample {
    public static void main(String[] args) {
        Plant p1 = new Plant();
        Plant p2 = new Plant("tulip", "red");
        Plant p3 = new Plant("cactus");
        p1.print();
        p2.print();
        p3.print();
    }
}
