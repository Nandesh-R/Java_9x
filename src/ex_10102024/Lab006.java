package ex_10102024;

public class Lab006 {
    public static void main(String[] args) {
        // Char

        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r'; // delete the previous word

        System.out.println("Nand"+ new_line +  "Gowda");
        //System.out.println("Nand" +  "Gowda");
        System.out.println("Nand"+ tab_line +  "Gowda");
        System.out.println("Nand"+ back_space +  "Gowda");
        System.out.println("Nand"+ car_r +  "Gowda");

        char c11  = '\u1F60';
        // ASCII ->
        // chinese - india, japense -> Unicode
        // /u09878

    }
}
