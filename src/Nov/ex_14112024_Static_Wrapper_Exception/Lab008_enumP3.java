package Nov.ex_14112024_Static_Wrapper_Exception;

public class Lab008_enumP3 {
    public static void main(String[] args) {
        System.out.println(Color.BLUE.gethexcode());

        if (Color.RED.gethexcode() == "#FF0000"){
            System.out.println("Its Color Red");
        }
    }
}

enum Color {

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexcode;

    Color(String hexcode){
        this.hexcode = hexcode;
    }

    String gethexcode(){
        return this.hexcode;
    }
}
