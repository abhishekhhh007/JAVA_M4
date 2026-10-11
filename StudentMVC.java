
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class StudentView {
    void displayStudentDetails(String name, int rollNo) {
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class StudentController {
    Student model;
    StudentView view;

    StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    void updateView() {
        view.displayStudentDetails(
            model.name, model.rollNo);
    }
}

public class StudentMVC {
    public static void main(String[] args) {
        Student model = new Student("Abhishek", 12);
        StudentView view = new StudentView();

        StudentController controller =
            new StudentController(model, view);

        controller.updateView();
    }
}
