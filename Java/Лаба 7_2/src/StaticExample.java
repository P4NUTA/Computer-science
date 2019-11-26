// 5 point
public class StaticExample {
    static int result;

    public static void main(String[] args) {
        int[] array = {-3, 20, 5, 16, 27};
        // итерация по объектам коллекции
        for (int value : array) {
            // тернарный оператор
            result = (value % 4 == 0) ? 1 : 0;
            System.out.println(result);
        }
        Triangle t1 = new Triangle(3);
        Triangle t2 = new Triangle(4);
        Triangle.checkTriangles(t1, t2);
    }
}
// 6 point
class StaticContainer {
    static int counter = 3;
    public static void operation(){
        counter*=3;
    }
}
// 7 point
class StaticCheck{

}