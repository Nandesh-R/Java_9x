package ex_29102024_Arrays;

public class Task1_Duplicate {
    public static void main(String[] args) {
        int[] value = new int[4];
        value[0] = 10;
        value[1] = 20;
        value[2] = 10;
        value[3] = 15;

        boolean hasdup = duplicate(value);

        if(hasdup){
            System.out.println("The array contains duplicates.");
        }else{
            System.out.println("The array doesnt contains duplicates.");
        }
    }

    static boolean duplicate(int[] value){

        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] == value[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
