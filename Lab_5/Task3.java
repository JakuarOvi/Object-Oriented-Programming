/*
Task 3 - Employee Management:
Create an employee management system with different types of employees
like FullTime and PartTime that inherit from a common Employee class.
Encapsulate attributes in the base class: name, employeeID and salary.
Implement polymorphism with the following methods:
calculateEarnings(): Calculate and return the earnings of the employee.
displayInfo(): Display the employee's name, ID, and earnings.
*/

package ovi.task3;


// Base class
abstract class Employee {
    protected String name;
    protected String employeeID;
    protected double salary;
    
    public Employee(String name, String employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }
    
    public abstract double calculateEarnings();
    
    public void displayInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + employeeID + ", Earnings: " + calculateEarnings());
    }
}

class FullTimeEmployee extends Employee {
    private double bonus;
    
    public FullTimeEmployee(String name, String employeeID, double salary, double bonus) {
        super(name, employeeID, salary);
        this.bonus = bonus;
    }
    
    @Override
    public double calculateEarnings() {
        return salary + bonus;
    }
}

// Derived class - Part-Time Employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    
    public PartTimeEmployee(String name, String employeeID, int hoursWorked, double hourlyRate) {
        super(name, employeeID, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public double calculateEarnings() {
        return hoursWorked * hourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("John Doe", "FT123", 50000.0, 5000.0);
        PartTimeEmployee pt = new PartTimeEmployee("Jane Smith", "PT456", 20, 25.0);
        
        ft.displayInfo();
        pt.displayInfo();
    }
}
