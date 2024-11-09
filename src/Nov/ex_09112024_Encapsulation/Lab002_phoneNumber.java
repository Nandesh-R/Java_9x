package Nov.ex_09112024_Encapsulation;

public class Lab002_phoneNumber {
    public static void main(String[] args) {
        Person p1 = new Person("Nandesh", 9036);
        //System.out.println(p1.name); > Since it is private we are unable to get name or phone number, we can only get through getter & setter method

        System.out.println(p1.getName());//get name
        System.out.println(p1.getPhonemuber(true));//get phone number

        p1.setName("Nandesh Gowda");//set new name
        System.out.println(p1.getName());

        p1.setPhonemuber(1835);
        System.out.println(p1.getPhonemuber(true));
    }

}

class Person{
    private String name;
    private int phonemuber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonemuber(boolean isAdmin) {
        if (isAdmin){
            return phonemuber;
        }else{
            return 0;
        }
    }

    public void setPhonemuber(int phonemuber) {
        this.phonemuber = phonemuber;
    }

    public Person(String name, int phonemuber) {
        this.name = name;
        this.phonemuber = phonemuber;


    }
}
