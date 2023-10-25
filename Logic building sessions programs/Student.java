public class Student{
    private String name;
    private int rollNumber;
    private int age;

    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Dipak", 101, 20);
        Student student2 = new Student("Deva", 102, 21);

        System.out.println("Student1 details:");
        student1.displayDetails();

        System.out.println("\nStudent2 details:");
        student2.displayDetails();
    }
}