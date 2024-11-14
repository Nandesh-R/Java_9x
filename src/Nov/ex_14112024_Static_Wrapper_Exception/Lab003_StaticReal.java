package Nov.ex_14112024_Static_Wrapper_Exception;

public class Lab003_StaticReal {
    public static void main(String[] args) {
        ATB s1 = new ATB("Amir");
        ATB s2 = new ATB("Sharukh");
        ATB s3 = new ATB("Salman");
        ATB s4 = new ATB("Rajini");

        ATB s5;
        new ATB("Nand");

        s1.readDocuments();
        s2.readDocuments();

        // Static
        ATB.doAssignment(); // Static Method
        System.out.println(ATB.courseName); // Static Variable

    }

}

class ATB{

    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
        System.out.println("Reading from CSV file");
    }

    static {
        System.out.println("Load the class?, I will execute");
    }


    private String name;
    private String phone;
    static String courseName = "ATB9x";

    public String getName() {
        return name;
    }

    public ATB(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non Static Method");
        System.out.println(courseName);
    }

    static void doAssignment(){
        //System.out.println(phone);
        System.out.println("Do Assignment");
    }

    static class GenAI{
        // 0.0001% in Automation
    }

}

