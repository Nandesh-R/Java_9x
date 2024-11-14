package Nov.ex_14112024_Static_Wrapper_Exception;

public class Lab002_Static_IIB_SIB {
    public static void main(String[] args) {
        A N1 = new A();
        A N2 = new A();
        new A();
        A N3;//only Reference creation doesn't call SIB

    }
}

class A{
    {
        System.out.println("This is IIB");
    }

    static {
        System.out.println("This is SIB");
    }
}
