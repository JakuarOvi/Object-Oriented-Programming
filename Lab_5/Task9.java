/*
Task 9 - Student Management:
Develop a student management system with different types of students like
Undergraduate and Graduate that inherit from a common Student class.
Encapsulate attributes in the base class: studentName, studentID and
grades (which is an array).
Implement polymorphism with the following methods:
calculateAverageGrade(): Calculate and return the average grade of the
student from the grades array.
displayStudentInfo(): Display the student's name, ID, and average grade.
*/

package ovi.task9;
abstract class Student {
    protected String studentName;
    protected String studentID;
    protected int[] grades;

    // Constructor to initialize common attributes
    public Student(String studentName, String studentID, int[] grades) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.grades = grades;
    }

    // Abstract method to calculate the average grade
    public abstract double calculateAverageGrade();

    // Abstract method to display student information
    public abstract void displayStudentInfo();
}

class Undergraduate extends Student {

    public Undergraduate(String studentName, String studentID, int[] grades) {
        super(studentName, studentID, grades);
    }

    // Implementing the method to calculate the average grade for an undergraduate
    @Override
    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Implementing the method to display the student's information
    @Override
    public void displayStudentInfo() {
        System.out.println("Undergraduate Student Info:");
        System.out.println("Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}
class Graduate extends Student {

    public Graduate(String studentName, String studentID, int[] grades) {
        super(studentName, studentID, grades);
    }

    // Implementing the method to calculate the average grade for a graduate
    @Override
    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Implementing the method to display the student's information
    @Override
    public void displayStudentInfo() {
        System.out.println("Graduate Student Info:");
        System.out.println("Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}
public class Task9 {
    public static void main(String[] args) {
        // Create some undergraduate and graduate students
        int[] gradesUndergrad = {85, 90, 78, 92};
        int[] gradesGrad = {88, 91, 89, 94};

        Student student1 = new Undergraduate("John Doe", "U12345", gradesUndergrad);
        Student student2 = new Graduate("Jane Smith", "G67890", gradesGrad);

        // Display the student info and average grades
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
