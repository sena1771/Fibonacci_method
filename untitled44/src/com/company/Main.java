package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
             /*
 0 + 1 = 1
 1 + 1 = 2
 1 + 2 = 3
 2 + 3 = 5
 3 + 5 = 8
 5 + 8 = 13
 13 + 8 = 21
 21 + 8 = 34
         */
        Scanner inp = new Scanner(System.in);
       
        System.out.print("The number of entries for Fibonacci: ");
        int number = inp.nextInt();
        System.out.print(Fibonacci(number));
    }
       public static int Fibonacci(int number){
           int a=1,b=1,c = 0;
           int k=c;
       for(int i=1;i<number;i++){
         c=a+b;
           System.out.print(a+"+"+b);
           System.out.print("=");
           System.out.print(c);
           System.out.println(" ");
           a=b;
           b=c;
       
       }


        return k;  }







}
