package ex_15102024;

public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 15;
        int max_val = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max_val);
    }
}
