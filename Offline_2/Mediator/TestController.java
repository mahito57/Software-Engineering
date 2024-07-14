package Mediator;

import java.util.Random;
import java.util.Scanner;

public class TestController {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student1 = new Student(10, 94);
        Student student2 = new Student(16, 74);
        Student student3 = new Student(1, 85);
        Student student4 = new Student(6, 67);
        Student student5 = new Student(22, 79);
        teacher.setStudentsmarks(student1);
        teacher.setStudentsmarks(student2);
        teacher.setStudentsmarks(student3);
        teacher.setStudentsmarks(student4);
        teacher.setStudentsmarks(student5);

        Controller controller = new Controller();
        teacher.sendscript(controller);
        controller.publishmarks();

        Random random = new Random();
        int rand = 0;
        while (true) {
            rand = random.nextInt(5);
            if (rand != 5) break;
        }

        controller.sendError(controller.getStudentsmarks().get(rand));
        controller.publishmarks();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            if (x < controller.getStudentsmarks().size()) {
                Student student = controller.getStudentsmarks().get(x);
                student.reexamine(controller);
                controller.publishmarks();
            }else {
                break;
            }

        }
    }
}
