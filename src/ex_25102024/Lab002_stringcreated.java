package ex_25102024;

public class Lab002_stringcreated {
    public static void main(String[] args) {
        String name = "nandesh";
        name = "gowda";
        name = "nandeshgowda";
        name = "nandesh"; // SCP

        // String -> data type
        // name -> Ref
        // = -> assignment operator
        // "Pramod" - Literal(String)

        System.out.println(name);



        String name2 = new String("Pramod");
        String name3 = new String("Pramod");
        String name5 = name2;
    }
}
