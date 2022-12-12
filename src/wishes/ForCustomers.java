package wishes;

import java.util.Scanner;

public class ForCustomers {
    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your client name:");
        String client = scanner.nextLine();

        System.out.println("Enter your company name:");
        String yourcompany = scanner.nextLine();

        System.out.println("Enter year number/s client work with:");
        String number = scanner.nextLine();

        System.out.println("Enter new year number:");
        String newyear = scanner.next();

        scanner.close();

        System.out.println("Happy New Year, " + client + " Your loyalty to " + yourcompany + " means more and more with " + number + " years. Thank you for choosing us, and may " + newyear + " be your best one yet!");
    }
}
