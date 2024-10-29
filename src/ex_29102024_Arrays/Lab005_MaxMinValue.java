package ex_29102024_Arrays;

public class Lab005_MaxMinValue {
    public static void main(String[] args) {
        int[] value = new int[3];
        value[0] = 10;
        value[1] = 50;
        value[2] = 25;

        System.out.println("length of value: "+ value.length);
        int largenumb = max_value(value);
        System.out.printf("Max Value is %d", largenumb);

        System.out.println();

        int smallnumb = min_value(value);
        System.out.printf("Smallest number is: %d", smallnumb);
    }

    static int max_value(int[] value){
        int max = value[0];
        for(int i = 1;i < value.length; i++){
            if(value[i] > max){
                max = value[i];
            }
        }
        return max;
    }

    static int min_value(int[] value){
        int min = value[0];
        for(int i=1;i<value.length;i++){
            if(value[i] < min){
                min = value[i];
            }
        }
        return min;
    }
}
