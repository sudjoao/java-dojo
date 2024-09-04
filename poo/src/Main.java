import exercise1.Grade;
import exercise1.Student;
import exercise1.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Grade> gradeList = new ArrayList<>();
        System.out.println("Type the subjects of your school");
        int option;
        do {
            System.out.println("Subject name:");
            String subjectName = scanner.nextLine();
            System.out.printf("Type de student grade for %s:", subjectName);
            gradeList.add(new Grade(new Subject(subjectName), scanner.nextDouble()));
            System.out.println("Type 0 to leave or another number to continue");
            option = scanner.nextInt();
            scanner.nextLine();
        }while (option !=0);
        System.out.println("Now type the student name:");
        String name = scanner.nextLine();
        Student student = new Student(gradeList, name);
        System.out.println(student);
    }
}