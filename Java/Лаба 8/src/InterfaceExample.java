public class InterfaceExample {
    public static void main(String[] args) {
        Department department = new Department();
        department.setTitle("Department of CET");
        department.hireEmployee("John");
        System.out.println(department.getInfo());
        Faculty faculty = new Faculty();
        faculty.setTitle("Faculty of SECS");
        faculty.addDepartment(department);
        faculty.hireEmployee("Jack");
        System.out.println(faculty.getInfo());
    }
}
