package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab002_Abstraction {
}


class nandesh extends Loan{
    @Override
    void loan50k() {   //User nandesh has to give full definition since it is abstraction
        System.out.println("Giving the Loan of 50K");
    }

    @Override
    void loan30k() {
        System.out.println("Giving loan of 30K");
    }
}
abstract class Loan{                   //this class & method is abstract class & method
    abstract void loan50k();  //incomplete function hence it is abstract function
    //Only declaration no Definition
    abstract void loan30k();


    void loan1lk(){
        System.out.println("1lakh Loan is available"); //Complete function so it is not an abstract function
    }
}

class student1{} //this is a Concrete since it doesnt have abstract class