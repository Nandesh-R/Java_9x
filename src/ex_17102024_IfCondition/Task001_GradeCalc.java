package ex_17102024_IfCondition;
import java.util.Scanner;
public class Task001_GradeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your your marks:");
        int marks = scanner.nextInt();
        System.out.println();

        if (marks>=90 && marks<=100){
            System.out.println("Your grade is A");
        }else if (marks>=80 && marks<=89){
            System.out.println("Your grade is B");
        }else if (marks>=70 && marks<=79){
            System.out.println("Your grade is C");
        }else if (marks>=60 && marks<=69){
            System.out.println("Your grade is D");
        }else if (marks>=50 && marks<=59){
            System.out.println("Your grade is E");
        }else{
            System.out.println("Your grade is F");
        }

        scanner.close();

    }
}
