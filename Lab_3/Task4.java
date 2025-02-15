/*
Task 4: Create a class hierarchy for employees in a company.
• Start with a base class called "Employee" with attributes "name", "employeeId",
and "salary".
• Introduce a method in the Employee class to count the vowels in the employee’s
name.
• Then, create two subclasses "Manager" and "Developer" that inherit from the
Employee class.
• Add specific attributes and methods for each subclass.
• Finally, create instances of both Manager and Developer classes and display
their information.

Output:
Manager Information:
Name: Sasuke and It contains 3 vowels.
Employee ID: 101
Salary: $80000.0
Department: HR

Developer Information:
Name: Naruto and It contains 3 vowels.
Employee ID: 201
Salary: $70000.0
Programming Language: Java
*/

package com.mycompany.task4;
class Employee {
    String name;
    int employeeId;
    double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int countVowels() {
        int count = 0;
        String nameLower = name.toLowerCase();
        for (int i = 0; i < nameLower.length(); i++) {
            char ch = nameLower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public void displayManagerInfo() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + name + " and It contains " + countVowels() + " vowels.");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDeveloperInfo() {
        System.out.println("\nDeveloper Information:");
        System.out.println("Name: " + name + " and It contains " + countVowels() + " vowels.");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class Task4 {
    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager("Sasuke", 101, 80000.0, "HR");
        Developer developer = new Developer("Naruto", 201, 70000.0, "Java");

        // Display their information
        manager.displayManagerInfo();
        developer.displayDeveloperInfo();
    }
}
