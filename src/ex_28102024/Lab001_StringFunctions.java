package ex_28102024;

public class Lab001_StringFunctions {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        // substring - many interviews
        String s1 = "Nandesh";
        String s2 = s1.concat("Gowda");
        System.out.println(s2);


        String fruits = "apple,banana,cherry"; // delimter = ,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2 = "ABC-XYZ-QWE"; // delimter = ,
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);


        String s4 = "Nandesh";
        System.out.println(s4.charAt(0));
        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException

        String s5 = " Nandesh ";
        System.out.println(s5.trim());

        String s6 = "Nandesh";
        System.out.println(s6.indexOf("r"));
        System.out.println(s6.indexOf("d"));

        String s7 = "Nandesh";
        System.out.println(s7.contains("ra"));
        System.out.println(s7.contains("zy"));

        String s8 = "Nandeshgowda";
        System.out.println(s8.lastIndexOf("d"));

        String s9 = "Nandeshgowda";
        System.out.println(s9.replace("d","z"));
        System.out.println(s9.replaceAll("d","z"));

        String s10 = "Nandeshgowdaji";
        System.out.println(s10.startsWith("Nan"));
        System.out.println(s10.endsWith("ji"));
        System.out.println(s10.endsWith("zy"));



        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);


        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);
    }
}
