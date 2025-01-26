/*
Task 2: Reverse the elements of an array. Store it in a new one and print
the new Array. The size of the array is not specified, means it could be 5 or
7 or any integer value.

Sample Input: [ 1, 2, 3, 4, 5 ]
Output: [ 5, 4, 3, 2, 1 ]

Sample Input: [ 5, 3, 9, 2, 1, 7 ]
Output: [ 7, 1, 2, 9, 3, 5 ]
 */
package com.mycompany.task2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[i] = a[n - 1 - i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(reversedArray[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        sc.close(); 
    }
}
