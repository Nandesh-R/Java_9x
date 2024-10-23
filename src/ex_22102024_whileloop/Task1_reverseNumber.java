package ex_22102024_whileloop;

import java.util.Scanner;

public class Task1_reverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be reversed: ");
        int i = sc.nextInt();//inut a number

        int rev = 0;//variable to store the reveresed number

        for(;i!=0;i/=10){
            int digit = i % 10;
            rev = rev * 10 + digit;
        }
        System.out.println("Reverserd number is " + rev);
        sc.close();
    }
}
