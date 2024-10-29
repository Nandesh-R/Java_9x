package ex_29102024_Arrays;

public class Lab006Nandexr {
    public static void main(String[] args) {
        int[] marks = {10,20,30,40};
        System.out.println(marks[0]);
        System.out.println("No.of Sub is: " + marks.length);

        int[] marks1 = new int[3];
        marks1[0] = 50;
        marks1[1] = 60;
        marks1[2] = 70;
        System.out.println(marks1[0]);
        System.out.println("No.of Sub is: " + marks1.length);

        for(int i=0;i<marks.length;i++){
            System.out.println("List value:" + i + ":" + marks[i]);
        }

        marks[0] = 100;
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        String[] names = {"nand", "prath", "bala"};
        boolean[] yesno = new boolean[2];
        yesno[0] = true;
        yesno[1] = false;
        System.out.println(names[1]);
        System.out.println(yesno[1]);
    }
}
