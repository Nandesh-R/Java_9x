package Nov.ex_08112024_Polymorphisim.MethodOverloading;

public class Lab001 {
    public static void main(String[] args) {
        MathOperation M1 = new MathOperation();
        double Result = M1.add(1234,12335);
        System.out.println(Result);
    }
}

class MathOperation{

    // Method Overloading
    // Method will be Over load
    // Same name button different Argument or param


    int add(int a , int b) {
        return a + b;
    }

    float add(float a , float b){
        return a + b;

    }

    void add(int a, int b, int c){
        System.out.println("Hello");
    }

    double add(double a , double b){
        return a + b;
    }
}
