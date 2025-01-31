import java.util.Scanner;

public class take_input_from_user {
    public static void main(String[] args) {
        int number;
        System.out.println("enter a number (only intiger since we are using 'int' datatype) : ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();

        System.out.println("your entered number is : " + number);

        // closing the Scanner object
        s.close();   // this is to prevent resource leaks
    }
}
