package Nov.ex_08112024_Polymorphisim.MethodOverRiding;

public class Lab002 {
    public static void main(String[] args) {
        Son H1 = new Son();
        H1.house();

        Father F1 = new Father();
        F1.house();

        //Dynamic Dispatch

        Father F = new Son();
        F.house();
    }
}

class Father{
    void house(){
        System.out.println("1BHK");
    }
}

class Son extends Father{
    @Override
    void house(){
        System.out.println("3BHK");
    }
}
