package ex_09102024;

public class Lab001 {
    public static void main(String[] args) {
        // Primitive Data Type
        byte b  = 100; // 8 bits, 1 Byte
        short s  = 128; // 16 bits, 2 Byte
        int i = 1000; // 32 bits, 4 Byte
        long l = 999999999; // 64 Bits, 8 Bytes
        char grade = 'A'; // 'A', b, c , e, d, el -> ASCII value - int - assigned.
        // 16 Bits, 2 Byte
        float f2 = 3.14F; // 32 Bits, 4 Byte
        double d = 118.9876543; // 64 Bites, 8 Bytes


        // Non primitive Data Types (user defined)
        String name = "Nandesh"; // String - bunch of char(collection of chars)
        // Array, Class- User Data Types. - 64 Bits, 8 Byte

        System.out.printf("byte value is %b",  b);
        System.out.println();
        System.out.printf("short value is %d", s);
        System.out.println();
        System.out.printf("int value is %d", i);
        System.out.println();
        System.out.printf("long value is %d", l);
        System.out.println();
        System.out.printf("float value is %f", f2);
        System.out.println();
        System.out.printf("double value is %f", d);
        System.out.println();
        System.out.printf("My Name is %s", name);
        System.out.println();
    }
}
