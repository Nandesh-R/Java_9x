package ex_22102024_whileloop;
import java.util.Scanner;

public class Task3_palindromeofstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to verify palindrome or not: ");
        String input = sc.nextLine().toLowerCase();

        String rev = "";

        for(int i=input.length()-1;i>=0;i--){
            rev = rev + input.charAt(i);
        }
        System.out.println(rev);

        if(input.equals(rev)){
            System.out.println("the string is palindrome");
        }else{
            System.out.println("the string is not a palindrome");
        }
        sc.close();
    }
}