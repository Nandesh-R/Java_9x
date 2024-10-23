package ex_23102024_functions;
import java.util.Scanner;
public class Task_calci_usingFunction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("sum is: " + sum(a,b));
        System.out.println("sum is: " + sub(a,b));
        System.out.println("sum is: " + mul(a,b));
        System.out.println("sum is: " + div(a,b));
    }
//return type sum
    static int sum(int a, int b){
        return a + b;
    }

    static int sub(int a, int b){
        return a - b;
    }

    static int mul(int a, int b){
        return a * b;
    }

    static int div(int a, int b){
        if(b != 0){
            return a / b;
        }else{
            System.out.println("Error: b value shouldnt be zero");
            return 0;
        }
    }
}
