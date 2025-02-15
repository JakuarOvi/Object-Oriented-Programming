/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task3;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
            if(n%i==0){
           System.out.print(i+" ");
            }
       }
       
    }
}
