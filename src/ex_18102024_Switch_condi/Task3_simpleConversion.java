package ex_18102024_Switch_condi;
import java.util.Scanner;
public class Task3_simpleConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //inputs
        System.out.print("Enter the Value:");
        double value = sc.nextDouble();
        //Select conversion fetaure
        System.out.print("Enter the format of conversion to be done (1.Km to Mts, 2.Mts to Km, 3.Fh to cel, 4.Cel to Fh)?");

        int conver = sc.nextInt();
        switch (conver){
            case 1:
                double out1 = value * 1000;
                System.out.println(value + "Km =" + out1 + "mts");
                break;
            case 2:
                double out2 = value / 1000;
                System.out.println(value + "mts =" + out2 + "Km");
                break;
            case 3:
                double out3 = (value - 32) * 5/9;
                System.out.println(value + "Fh =" + out3 + "Cel");
                break;
            case 4:
                double out4 = (value * 9/5) + 32;
                System.out.println(value + "Cel =" + out4 + "Fh");
                break;
            default:
                System.out.println("Error: Wrong input");
                break;
        }
        System.out.print("Program terminated");
        sc.close();
    }
}
