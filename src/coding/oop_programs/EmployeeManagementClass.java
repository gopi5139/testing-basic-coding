package coding.oop_programs;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id; this.name = name; this.department = department;
    }
    public void display() { System.out.println(id + " " + name + " " + department); }
}

public class EmployeeManagementClass {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Alice", "QA");
        e.display();
    }
}
