package ex_18102024_Switch_condi;

public class Lab005 {
    public static void main(String[] args) {
        int itemcode = 003;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
