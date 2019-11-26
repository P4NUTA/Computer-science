// 4 point
public class Triangle {
    public double side; // сторона

    public Triangle(double side) {
        this.side = side;
    }

    public double area() {
        return (Math.sqrt(3) / 4) * Math.pow(this.side, 2);
    }

    public static void checkTriangles(Triangle triangle1,
                                      Triangle triangle2) {
        double area1 = triangle1.area();
        double area2 = triangle2.area();
        if (area1 == area2) {
            System.out.println("Треугольники равны");
        } else if (area1 > area2) {
            System.out.println("Первый треугольник больше второго");
        } else {
            System.out.println("Второй треугольник больше первого");
        }
    }
}
