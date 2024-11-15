package Nov.ex_15112024_Wrapper_Exception_P2;

public class Lab004_Exception1 {
    public static void main(String[] args) {
        System.out.println("Start of the Program");
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println(b);
        System.out.println("End of the Program");



        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // Lab004_Exception1.main()
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM

    }
}
