package ex_23102024_functions;


public class Lab001 {
    public static void main(String[] args) {

        // User Defined Functions.

//  1.Without Parameters and Without Return Type
// 2.Without Parameters but With Return Type
// 3.With Parameters and Without Return Type
// 4. With Parameters and With Return Type

        greet();

        int voting_age = vote_age();
        System.out.println(voting_age);
        if(voting_age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

        greet_with_name("nandesh");

        int output = sum(10,20);
        System.out.println(output);

    }
    static void greet(){
        System.out.println("Hello world");
    }
    static int vote_age(){
        return 18;
    }

    static void greet_with_name(String name){
        System.out.println("your name is " + name);
    }

    static int sum(int a,int b){
        return a + b;
    }


}

