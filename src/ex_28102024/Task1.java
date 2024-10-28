package ex_28102024;

public class Task1 {
    public static void main(String[] args) {
        String name = "hello,Nandesh";
        String games = "Cricket,Football,Tennis";
        int i = name.length();
        String result = name.substring(2,7);
        int index = name.indexOf("d");
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        String trimmed = "     hello    " .trim();
        String name_initial = "R";
        String full_name = name + " " + name_initial;
        String s1 = name.concat(name_initial);
        String[] splitting = games.split(",");
        String replace_1 = name.replace("l", "T");
        String replaceall_1 = name.replaceAll("h", "z");
        // String contains_1 = name.contains("N");
        String s2 = "Nandesh";


        System.out.println(i);
        System.out.println(result);
        System.out.println(index);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(trimmed);
        System.out.println(full_name);
        System.out.println(s1);
        System.out.println(splitting[2]);
        System.out.println(name.charAt(1));
        System.out.println(replace_1);
        System.out.println(replaceall_1);
        System.out.println(s2.contains("ra"));
        System.out.println(s2.contains("Nan"));
    }
}
