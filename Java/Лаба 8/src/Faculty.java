import java.util.ArrayList;
import java.util.Arrays;

public class Faculty implements StructureUnit {
    String title;
    private ArrayList<Department> departments;
    private ArrayList<String> employees; // множество сотрудников

    public Faculty() {
        this.employees = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // нанять сотрудника
    public void hireEmployee(String name) {
        this.employees.add(name);
    }

    // уволить сотрудника
    public void fireEmployee(String name) {
        this.employees.remove(name);
    }

    // добавить вложенную структ. единицу
    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    // получение информации о структурной единице
    public String getInfo() {
        int num = this.employees.size();
        String info = "Title: " + this.title + " | Number of employees: " + num + " | Employees:" + Arrays.toString(this.employees.toArray());
        info += "\n Info from departments: \n";
        for (Department d : departments)
            info += d.getInfo() + "\n";
        return info;
    }
}
