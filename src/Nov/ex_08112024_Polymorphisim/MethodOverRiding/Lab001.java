package Nov.ex_08112024_Polymorphisim.MethodOverRiding;

public class Lab001 {
    public static void main(String[] args) {
        Labdog d1 = new Labdog();
        d1.bark();
    }
}

class Dog{
    void bark(){
        System.out.println("I am Dog, i will bark!");
    }
    int age = 10;
}

class Labdog extends Dog{
    @Override
    void bark(){
        System.out.println("I make sound wooooow");
    }
}