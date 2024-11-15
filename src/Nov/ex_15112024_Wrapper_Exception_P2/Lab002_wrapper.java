package Nov.ex_15112024_Wrapper_Exception_P2;

public class Lab002_wrapper {
    public static void main(String[] args) {
        //Primitive to Wrapper class

        int a = 10;
        Integer b = a; //Boxing = int -> Integer
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        b.intValue();


        Integer a2 = 42;
        int b2 = a2; //Unboxing = Integer ->
        System.out.println(b2);

    }
}
