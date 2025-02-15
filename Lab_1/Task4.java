/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ovi.task4;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int c=05;
       for(int i=2;i<=n/2;i++)
       {
            if(n%i==0){
           c++;
            }
       }
       if(c>0)
       {
           System.out.println(n+" is not a prime number");
       }
       else
           {
           System.out.println(n+" is a prime number");
       }
       
    }
}
