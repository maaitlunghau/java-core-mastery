public class StudentClass {
    // Attributes (thuộc tính của class)
    String name;
    int age;
    String studentId;
    String major;
    double gpa;

    // Constructor (phương thức khởi tạo)
    public StudentClass() {
    }

    public StudentClass(
            String name,
            int age,
            String studentId,
            String major,
            double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }

    // Methods (phương thức của class)
    public void study() {
        System.out.println(name + " is studying.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Phương thức displayInfo() dùng để hiển thị thông tin của sinh viên
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}
