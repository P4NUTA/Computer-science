public class Chair extends Furniture {
    private String color;
    public Chair(String material, double age, String
            color) {
        super(material, age);
        this.color = color;
    }
    @Override
    public void print() {
        System.out.println("from Furniture: ");
        super.print();
        System.out.println("Chair: ");
        System.out.println("material: " +
                this.material + "; age: " + this.age +
                "; color: " +
                this.color);
    }
}