package com.intellj;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
         practice 1
        float a = (7/4.0f * 9/2.0f);
        System.out.println(a);
        Practice 2
        char grade = 'B';
        grade += 8;
        System.out.println(grade);
        grade -= 8;
        System.out.println(grade);
        Practice 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int a = sc.nextInt();
        System.out.println(a>19);
        Practice 3 - To calculate exppression
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Final Velocity v : ");
        float v = sc.nextFloat();
        System.out.print("Enter the Initial Velocity u : ");
        float u = sc.nextFloat();
        System.out.print("Enter the Acceleration a : ");
        float a = sc.nextFloat();
        System.out.print("Enter the Displacement s: ");
        float s = sc.nextFloat();
        float exp = (v*v - u*u)/(2*a*s);
        System.out.println(exp);
        Practice 4


    }
}
