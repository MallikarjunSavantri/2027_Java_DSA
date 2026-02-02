package Operators;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 1; i <= 5; i++) {
            total = total + sc.nextInt();
        }

        double percentage = (total / 500.0) * 100;
        System.out.println("Percentage: " +percentage+"%");

        if (percentage >= 90 && percentage <= 100)
            System.out.println("Grade A");
        else if (percentage >= 80)
            System.out.println("Grade B");
        else if (percentage >= 60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
        sc.close();
    }
}