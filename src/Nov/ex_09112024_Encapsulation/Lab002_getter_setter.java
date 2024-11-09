package Nov.ex_09112024_Encapsulation;

public class Lab002_getter_setter {
    public static void main(String[] args) {
        PNA N1 = new PNA("Nand", "Nand1234");
        System.out.println(N1.password);//it is possible to read & change the password since it is public


        goodPNA N2 = new goodPNA("Admin", "Admin@123");
        //System.out.println(N2.password);//Not able read or change the password since it is Private

        String N2Password = N2.getPassword();
        System.out.println(N2Password);
        N2.setPassword("Nand@123");
        System.out.println(N2.getPassword());
    }
}

class PNA{
    public String username;
    public String password;

    public PNA(String username, String password){
        this.username = username;
        this.password = password;
    }
}

class goodPNA{
    private String username;
    private String password;

    public goodPNA(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
