import java.util.Scanner;

public class ReadUserInputs {

    public static String scannerinput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Your Name: ");
        String somethingimported1 = scanner.nextLine();
        System.out.println("Please enter Your Age: ");
        int somethingimported2 = scanner.nextInt();
        //We can use functions like hasNextInt() to check if its correctly imported into the console
        String somethingimported = somethingimported1 + " " + Integer.toString(somethingimported2);

        scanner.close();

        return somethingimported;
    }

}
