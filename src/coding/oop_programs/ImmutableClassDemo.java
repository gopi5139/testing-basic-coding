package coding.oop_programs;

final class ImmutableStudent {
    private final String name;
    public ImmutableStudent(String name) { this.name = name; }
    public String getName() { return name; }
}

public class ImmutableClassDemo {
    public static void main(String[] args) {
        ImmutableStudent s = new ImmutableStudent("Tom");
        System.out.println(s.getName());
    }
}
