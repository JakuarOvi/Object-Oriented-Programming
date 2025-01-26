package com.mycompany.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        

        int[] sort = new int[n];
        for (int i = 0; i < n; i++) {
            sort[i] = sc.nextInt();
        }

        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || sort[i] != sort[i - 1]) {
                uniqueArray[index++] = sort[i];
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(uniqueArray[i]+" ");
            
        }

        sc.close();
    }
}
