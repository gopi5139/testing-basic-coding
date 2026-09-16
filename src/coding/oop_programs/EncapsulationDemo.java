package coding.oop_programs;

class Student {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setAge(26);
        System.out.println(student.getName() + " - " + student.getAge());
    }
}
