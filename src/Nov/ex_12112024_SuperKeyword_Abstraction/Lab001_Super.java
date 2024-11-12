package Nov.ex_12112024_SuperKeyword_Abstraction;

import java.sql.SQLOutput;

public class Lab001_Super {
    public static void main(String[] args) {
        Car c = new Car();

    }

}

class Car extends Vehicle{
    private int max_speed = 200;

    @Override
    void Display() {
        System.out.println("Child");
    }

    Car(){
        super(10);//calling parameterized constructor
        System.out.println("DC car");//Calling instance
        System.out.println(this.max_speed);
        //System.out.println(super.max_speed); //cannot be access since parent instance variable max speed is private
        this.Display();
        super.Display();

    }
}


class Vehicle{
    private int max_speed = 180;

    void Display(){
        System.out.println("parent");
    }

    Vehicle() {
        System.out.println("DC-parent");
    }

    Vehicle(int a){
        System.out.println("PC-parent");
    }

    void message(){
        System.out.println("Hello Vehicle");
    }

    void message(int a){
        System.out.println("Vehicle");
    }


}
