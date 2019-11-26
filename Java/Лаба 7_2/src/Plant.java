// 8 point
public class Plant {
    private String type;
    private String color;

    public Plant() {
    }

    public Plant(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public Plant(String type) {
        this.type = type;
    }

    public void print() {
        System.out.println("type: " + this.type + "; color: " + this.color);
    }
}