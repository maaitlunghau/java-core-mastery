public class Application {
    // khởi tạo method
    int sumTwoNum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // khởi tạo Object từ Class
        StudentClass student = new StudentClass();
        student.studentId = "T1S2404210";
        student.name = "maaitlunghau";
        student.age = 20;
        student.gpa = 4.0;
        student.major = "IT";
        student.displayInfo();

        // sử dụng Method từ Object
        Application app = new Application();
        int result = app.sumTwoNum(9, 7, 10);
        System.out.println("Result: " + result);
    }
}
