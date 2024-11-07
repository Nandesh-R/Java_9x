package Nov.ex_06112024_constructor;

import java.util.Scanner;

public class Paramiteroised_constructor {
    public static void main(String[] args) {
        car1 mycar = new car1("KIA", "White", 2022);
        System.out.println("Car name is: " + mycar.name);
        System.out.println("Car Color is: " + mycar.color);


        mycar.display();


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Car name:");
        String name_input = sc.nextLine();
        System.out.print("Enter the Car color:");
        String color_input = sc.nextLine();
        System.out.print("Enter the Car manufacturing year:");
        int car_year = sc.nextInt();
        car1 T1 = new car1(name_input, color_input,car_year);

        System.out.println(T1.name);
        System.out.println(T1.color);
        System.out.println(T1.year);

        T1.display();


        sc.close();

    }
}
