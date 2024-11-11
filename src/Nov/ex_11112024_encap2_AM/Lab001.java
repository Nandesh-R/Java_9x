package Nov.ex_11112024_encap2_AM;

import Nov.ex_11112024_encap2_AM.Real.Baseclass;
import Nov.ex_11112024_encap2_AM.Real.Testcase1;


public class Lab001 {
    public static void main(String[] args) {
        //Baseclass tc1 = new Testcase1(); //Dynamic Dispatch
        Testcase1 tc1 = new Testcase1();
        tc1.setBrowser("Chrome", true);
        //tc1.OpenBrowser();//Open browser is not public or protected, by default it acts like protected
        tc1.startTC();


    }
}
