// Assignment2.java
abstract class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract String getRole();

    public void display() {
        System.out.println("Role: " + getRole());
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Login {
    boolean login(String username, String password);
}

class Student extends Person implements Login {
    private String password;

    public Student(String name, String id, String password) {
        super(name, id);
        this.password = password;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public boolean login(String username, String password) {
        return this.name.equals(username) && this.password.equals(password);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Student s = new Student("Saurabh", "S101", "stud@123");

        if (s.login("Saurabh", "stud@123")) {
            System.out.println("Student Login Successful");
            s.display();
        } else {
            System.out.println("Student Login Failed");
        }
    }
}
