package Nov.ex_14112024_Static_Wrapper_Exception;

public class Lab005_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.Wednesday);
        System.out.println(Day.Sunday);
    }
}

enum Day{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
}
