package ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab001_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();

        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        if(age > 18) {
            System.out.println("Allowed to vote!");
        }
    }
}
