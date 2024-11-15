package Nov.ex_15112024_Wrapper_Exception_P2;

public class Lab007_Exception4 {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        s1.trim();
        System.out.println("End");

        // Unchecked - java.lang.NullPointerException
        // jvm - compile -> jvm knows at the Runtime -> Terminated the program.
    }
}
