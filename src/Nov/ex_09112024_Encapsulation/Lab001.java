package Nov.ex_09112024_Encapsulation;

public class Lab001 {
    public static void main(String[] args) {
        NPA N1 = new NPA("Nand", "Nand1234");
        System.out.println(N1.password);//it is possible to read & change the password since it is public


        goodNPA N2 = new goodNPA("Admin", "Admin@123");
        //System.out.println(N2.password);//Not able read or change the password since it is Private

        String N2Password = N2.giveMePassword(true);
        System.out.println(N2Password);
    }
}

class NPA{
    public String username;
    public String password;

    public NPA(String username, String password){
        this.username = username;
        this.password = password;
    }
}

class goodNPA{
    private String username;
    private String password;

    public goodNPA(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String giveMePassword(boolean isAuth){

        if (isAuth){
            return password;
        }else{
         return "None";
        }
    }
}
