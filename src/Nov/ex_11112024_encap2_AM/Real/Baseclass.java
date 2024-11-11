package Nov.ex_11112024_encap2_AM.Real;

public class Baseclass {

    private String browser; //Instance variable set to private Access Modifier

    Baseclass() {  //Parent constructor
        System.out.println("DC - browser");
    }

    Baseclass(String b) {
        System.out.println("PC - browser");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth){
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    void OpenBrowser(){
        System.out.println("Open Browser");
    }

    void OpenBrowser(String browserName){ //method Overridding
        System.out.println("Open Browser" + browserName);
    }

    void CloseBrowser(){
        System.out.println("Close Browser");
    }
}
