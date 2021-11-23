import java.util.Scanner;

public class StudentDatabaseApplication {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner (System.in);
        Student student1 = new Student();


        System.out.println("Enter the number of new student to enroll: ");
        int numOfStudents = Keyboard.nextInt();
        Student [] students = new Student[numOfStudents];

        for (int n = 0; n <numOfStudents; n++){
            students [n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students.toString());
        }

        System.out.println(students[0].toString());
        System.out.println(students[1].toString());
        System.out.println(students[2].toString());

    }
}
