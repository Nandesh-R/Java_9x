package Nov.ex_15112024_Wrapper_Exception_P2;

public class Lab005_Exception2 {
    public static void main(String[] args) {
        System.out.println("Start of program");

        String ip = args[0]; // ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // NumberFormatException: For input string: "nandesh"
        int b = 1000 / a; // ArithmeticException: / by zero
        System.out.println(b);

        System.out.println("End of program");


        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // Lab005_Exception2.main()
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM
        // If you don't handle the exception JVM will handle it
        // Always terminate the program with exception
    }
}
