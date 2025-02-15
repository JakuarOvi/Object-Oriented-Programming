/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ovi.task6;

/**
 *
 * @author Asus
 */
public class Task6 {

    public static void main(String[] args) {
       int n = 25; 
        System.out.println("The 25th Fibonacci number is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n; // Base cases
        int a = 0, b = 1, c = 0;
        
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        return c;
    }
}