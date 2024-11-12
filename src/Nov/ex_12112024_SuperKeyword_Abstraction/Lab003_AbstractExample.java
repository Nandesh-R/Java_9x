package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab003_AbstractExample {
    public static void main(String[] args) {
        child c = new child();
        c.loan50k();
        c.loan25k();
    }
}


class child extends father{
    @Override
    void loan50k() {

    }
}
abstract class father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("father returned loan of 25k");
    }

}
