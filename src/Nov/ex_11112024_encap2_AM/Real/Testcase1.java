package Nov.ex_11112024_encap2_AM.Real;


public class Testcase1 extends Baseclass{ //extends mean i> here single inheritance

    public Testcase1(){

        super();//Parent constructor
        System.out.println("DC - TC1");

    }

    public void startTC(){
        OpenBrowser("Chrome");
        CloseBrowser();

    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {  //Method Overriding
        System.out.println("Own Logic");

        super.setBrowser(browser, isAuth);
    }
}
