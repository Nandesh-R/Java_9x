package Nov.ex_14112024_Static_Wrapper_Exception;

public class Lab004 {
    public static void main(String[] args) {
        Automation T1 = new Automation();
        Automation T2 = new Automation();
        Automation T3 = new Automation();
        System.out.println(T1.Driver);
        System.out.println(T2.Driver);
        System.out.println(T3.Driver);
    }
}

class Automation{
    static String Driver = "MicrosoftEdge";
}
