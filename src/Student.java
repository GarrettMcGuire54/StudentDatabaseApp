import java.util.Scanner;
import static java.lang.System.out;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompts user to enter student's name and year
    public Student() {
        Scanner n = new Scanner(System.in);
        out.print("Enter Student first name: ");
        this.firstName = n.nextLine();

        out.print("Enter Student last name: ");
        this.lastName = n.nextLine();

        out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior");
        this.gradeYear = n.nextInt();

        setStudentID();
    }

    //Generate an ID
    private void setStudentID(){
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }


    //Enroll in courses
    public void enroll(){
        //Get inside a loop, user hits 0
        do {
            out.print("Enter course to enroll(Q to quit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
    }

    //View balance
    public void viewBalance () {
        out.println("Your balance is " + tuitionBalance);
    }

    //pay tuition
    public void payTuition() {
        viewBalance();
        out.print("Enter your payment amount: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show status

    public String showInfo(){
        return "Name: " + firstName+  " " + lastName +
                "\nStudent ID: " + studentID +
                "\nGrade level: " + gradeYear +
                "\nCourses Enrolled " + courses +
                "\nBalance: " + tuitionBalance;
    }
}