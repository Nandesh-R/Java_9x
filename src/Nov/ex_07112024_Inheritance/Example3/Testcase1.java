package Nov.ex_07112024_Inheritance.Example3;

public class Testcase1 extends Common_BaseTest{
    Testcase1(){
        System.out.println("DC-Child");
    }

    void testcase(){
        startbrowser();
        closebrowser();
        readfile();
    }
}
