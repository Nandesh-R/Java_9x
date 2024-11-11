package Nov.ex_11112024_encap2_AM.police;

public class Cop {

    private int gun;
    public String icard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void can_i_shoot(){   //protected is allowed within the package
        System.out.println("Yes you can Shoot");
    }
}
