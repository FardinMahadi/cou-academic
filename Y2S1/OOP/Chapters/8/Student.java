public class Student {
    private int id; // The ID of this student
    private String name; // The name of this student
    private java.util.Date dateCreated; // The date this student was created

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.dateCreated = new java.util.Date();
    }

    /** Return id */
    public int getId() {
        return id;
    }

    /** Return name */
    public String getName() {
        return name;
    }

    /** Return dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Student student = new Student(111223333, "John Doe");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Date Created: " + student.getDateCreated());
        
        // student.id = 123; // Error: id has private access in Student
    }
}
