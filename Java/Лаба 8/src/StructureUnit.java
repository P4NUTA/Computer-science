public interface StructureUnit {
    String university = "ITMO University";
    // нанять сотрудника
    void hireEmployee(String name);
    // уволить сотрудника
    void fireEmployee(String name);
    String getInfo();
}
