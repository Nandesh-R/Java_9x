package Nov.ex_15112024_Wrapper_Exception_P2;

public class Lab008_Exception5_Handle {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Can't do trim for Null, ARE you mad?");
        }
        System.out.println("End");

    }
}
