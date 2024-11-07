package Nov.ex_06112024_constructor;

public class car1 {
    String name;
    String color;
    int year;

    car1(String name, String color, int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }

    void display(){
        System.out.println("car1 details-->" + this.name + "-" + this.color + "-" + this.year);
    }
}
