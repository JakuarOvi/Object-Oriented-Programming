/*
 Task 1: Find the maximum and minimum elements in an array.
Sample Input: [ 5, 3, 9, 2, 1, 7 ]
Output:
Maximum: 9
Minimum: 1
 */
package com.mycompany.task1;

import java.util.Scanner;

/**
 *
 * @author Asus
 * 
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

       
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        sc.close(); 
    }
}
