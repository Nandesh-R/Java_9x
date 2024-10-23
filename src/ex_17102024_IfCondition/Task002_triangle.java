package ex_17102024_IfCondition;
import java.util.Scanner;
public class Task002_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter len of side a:");
        double a = sc.nextDouble();
        System.out.print("Enter len of side b:");
        double b = sc.nextDouble();
        System.out.print("Enter len of side c:");
        double c = sc.nextDouble();
        System.out.printf("a = %f",a);
        System.out.println();
        System.out.printf("a = %f",b);
        System.out.println();
        System.out.printf("a = %f",c);
        System.out.println();

        if (a==b && b==c) {
            System.out.print("This is Equilateral Triangle");
        }else if (a==b || b==c || c==a) {
            System.out.print("This is Isosceles Triangle");
        }else {
            System.out.print("This is Scalene Triangle");
        }

        sc.close();
    }
}
