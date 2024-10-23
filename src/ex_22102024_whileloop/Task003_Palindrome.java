package ex_22102024_whileloop;

import java.util.Scanner;
public class Task003_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the charater to count the Vowles & Constants in it: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0;
        int constants = 0;

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowels++;
            }else if(ch>='a' && ch<='z'){
                constants++;
            }
        }
        System.out.println("Total vowels are:" + vowels);
        System.out.println("Total constants are:" + constants);

        sc.close();
    }
}
