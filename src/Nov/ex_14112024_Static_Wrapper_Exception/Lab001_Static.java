package Nov.ex_14112024_Static_Wrapper_Exception;

public class Lab001_Static {
    public static void main(String[] args) {
        Student S1 = new Student(123);
        Student S2 = new Student(456);
        Student S3 = new Student(789);
        //S1.age;
        System.out.println(S1.age);
        System.out.println(Student.name);
        Student.name = "XYZ";
        System.out.println(Student.name);
        System.out.println(S1.name);
        System.out.println(S2.name);

    }
}

class Student{
    int age;//Non static variable//Instance Variable(It can be only accessed by Object of it)
    static String name = "abc ";//Static variable

    public Student(int age) {//Constructor
        this.age = age;
    }


    {
        System.out.println("IIB");//Instance Initialization Block
        System.out.println("This is called when ever an Object is created");
    }

    static {
        System.out.println("SIB");//Static Initialization Block
        System.out.println("Loaded Once, when class is loaded");
    }
}
