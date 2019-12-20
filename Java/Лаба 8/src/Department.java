import java.util.ArrayList;
import java.util.Arrays;

public class Department implements StructureUnit {
    private String title;
    private ArrayList<String> employees; // множество сотрудников

    public Department() {
        this.employees = new
                ArrayList<>();
    }

    public void setTitle(String title) {
        this.title =
                title;
    }

    // нанять сотрудника
    public void hireEmployee(String name) {
        this.employees.add(name);
    }

    // уволить сотрудника
    public void fireEmployee(String name) {
        this.employees.remove(name);
    }

    // получение информации о структурной единице
    public String getInfo() {
        int num = this.employees.size();
        return "Title: " + this.title + " | Number of employees: " + num + " | Employees:" + Arrays.toString(this.employees.toArray());
    }
}