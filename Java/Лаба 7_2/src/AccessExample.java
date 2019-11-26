// 2 point
public class AccessExample {
    public static void main(String[] args) {
        // обращение к полям с разными режимами доступа
        Cube c = new Cube(5, 4, 3);
        c.print();
        System.out.println(c.width);
        System.out.println(c.depth);
        Spy s = new Spy("Eggsy", "Gary Unwin", 1);
        s.getSpyInfo();
        s.print();
    }
}

// 3 point
class Spy {
    public String name;
    private String realName;
    private Integer squad;

    public Spy(String name, String realName, Integer squad) {
        this.name = name;
        this.realName = realName;
        this.squad = squad;
    }

    public void getSpyInfo() {
        System.out.println(this.realName);
    }

    public void print() {
        System.out.println(this.name);
    }
}