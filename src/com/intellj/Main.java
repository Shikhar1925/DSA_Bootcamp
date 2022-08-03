package com.intellj;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        System.out.println("HEllo World")
        System.out.println("*******Calculate your CBSE board Exam Total Percentage******");
        Scanner sub = new Scanner(System.in);
        System.out.print("Enter your Marks in Maths: ");
        float math = sub.nextFloat();
        System.out.print("Enter your Marks in English: ");
        float eng = sub.nextFloat();
        System.out.print("Enter your Marks in Science: ");
        float sci = sub.nextFloat();
        System.out.print("Enter your Marks in Hindi: ");
        float hindi = sub.nextFloat();
        System.out.print("Enter your Marks in Social Studies: ");
        float sst = sub.nextFloat();
        float total=0;
        total = math+sci+sst+hindi+eng;
        System.out.println("Your Total marks is out of 500 = " + total);
        float percent;
        percent = (total*100/500);
        System.out.println("Your percentage in this class is "+percent+"%");
    }
}