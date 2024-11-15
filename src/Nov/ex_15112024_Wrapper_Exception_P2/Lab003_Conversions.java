package Nov.ex_15112024_Wrapper_Exception_P2;

public class Lab003_Conversions {
    public static void main(String[] args) {
        String num = "10";
        //String --> Wrapper(Integer)-> Primitive int
        Integer a = Integer.valueOf(num);
        int a2 = a;//unboxing


        //String -->Primitive(Direct Conversion)
        int a3 = Integer.parseInt(num);

        Long l = 30l;
        Short s = 24;
        Boolean b = true;
    }
}
