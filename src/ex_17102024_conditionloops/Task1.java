package ex_17102024_conditionloops;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter Your Name:");

        String name = scanner.nextLine();



        System.out.print("Enter Your Age:");

        int Age = scanner.nextInt();



        System.out.print("Enter Your Sal:");

        double SAL = scanner.nextDouble();



        System.out.println("Enter your name" + name);

        System.out.println("Enter your name" + Age);

        System.out.println("Enter your name" + SAL);



        scanner.close();
    }
}
