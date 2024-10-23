package ex_11102024;

public class Lab004 {
    public static void main(String[] args) {
        String first_name = "nandesh";
        String last_name = "gowda";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // nandeshgowda1010 - first operator - + performed as Concatination
        System.out.println(a + b + first_name + last_name);
        // First + math -> 20nandeshgowda

        System.out.println(first_name + last_name + (a + b));
        // BODMAS -
    }
}
