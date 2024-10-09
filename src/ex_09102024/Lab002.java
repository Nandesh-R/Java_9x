package ex_09102024;

public class Lab002 {
    public static void main(String[] args) {
        // Store the distance between earth and moon
        long distance_between_earth_moon = 384400000l; //in M
        double distance_between_earth_moon2 = 384400000.865; //in M

        byte age= 122;
        int age1 = 100; // // wasting memory - 214768348488

        System.out.printf("Distance of Moon is %d", distance_between_earth_moon);
        System.out.println();
        System.out.printf("Distance of Moon2 is %f", distance_between_earth_moon2);
    }
}
