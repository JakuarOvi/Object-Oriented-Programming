/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
