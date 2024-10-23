package ex_17102024_conditionloops;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter No. a:");

        int a = scanner.nextInt();



        System.out.print("Enter No. b:");

        int b = scanner.nextInt();



        System.out.println("a value is:" + a);

        System.out.println("b value is:" + b);



        int result = ((a>b)? a : b);

        System.out.printf("Greater value is %d", result);



        scanner.close();
    }
}
