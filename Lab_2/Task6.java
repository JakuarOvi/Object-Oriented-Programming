/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int index = 0; 
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }

        while (index < n) {
            array[index++] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
          
        }

        sc.close();
    }
}