package Nov.ex_07112024_Inheritance.Example3;

public class Testcase2 extends Common_BaseTest{
    public Testcase2() {
        System.out.println("DC - child2");
    }

    void testcase2(){
        startbrowser();
        closebrowser();
        readfile();
        System.out.println("Test2 Execution is in progress");
    }
}
