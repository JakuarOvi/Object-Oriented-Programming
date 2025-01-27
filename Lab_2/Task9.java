/*
 Task 9: Complete the Employee, Manager, Developer classes. So that it
matches the output.

public class EmployeeHierarchy {
public static void main(String[] args) {
Manager manager = new Manager("Alice", "HR");
Developer developer = new Developer("Bob", "Java");

manager.displayInfo();
developer.displayInfo();
}
}

Output:
Name: Alice
Department: HR
Name: Bob
Programming Language: Java
 */

package com.mycompany.task9;


class Employee{
    void displayInfo(){
        System.out.println(this.getClass().getSimpleName());
    }
}

class Manager extends Employee{
    String name1,name2;
    Manager(String s1,String s2){
        this.name1=s1;
        this.name2=s2;
    }
  
    void displayInfo(){
        System.out.println("Name:"+name1);
        System.out.println("Department:"+name2);
    }
}

class Developer extends Employee {
    String name1,name2;
     Developer(String s1,String s2){
        this.name1=s1;
        this.name2=s2;
    }
   
    void displayInfo(){
        System.out.println("Name:"+name1);
        System.out.println("Programming Language:"+name2);
    }
}

public class Task9{
    public static void main(String[] args) {
       Manager manager = new Manager("Alice", "HR");
       Developer developer = new Developer("Bob", "Java");
       manager.displayInfo();
      developer.displayInfo();
 } 
    }
