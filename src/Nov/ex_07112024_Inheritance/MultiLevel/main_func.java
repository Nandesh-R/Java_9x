package Nov.ex_07112024_Inheritance.MultiLevel;

public class main_func {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.child();//Child home is executed, in chain child comes from 1st
        ch.extra_extra();
        ch.f();
        ch.gf();
        ch.home();

        Father fh = new Father();
        fh.extra();
        fh.home();
        fh.f();
        fh.gf();

        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

    }
}
