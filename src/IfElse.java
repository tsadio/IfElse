import java.util.Scanner;

public class IfElse {
    public static void main (String [] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = in.nextInt();


        if (number > 10)
            System.out.println(number + " is greater than 10.");
        else if (number < 10)
            System.out.println(number + " is less than 10.");
        else
            System.out.println(number + " is equal to 10." );

        System.out.println("Application finished.");
    }
}
