import java.util.Scanner;
public class StringInput {
//IDE - integrated development environment
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstname = scan.nextLine();
        System.out.println("Enter last name:");
        String lastname = scan.nextLine();
        System.out.println("Enter middle name:");
        String middlename = scan.nextLine();
        System.out.println("Full name:");
        System.out.print(firstname);
        System.out.print('\t');
        System.out.print(lastname);
        System.out.print('\t');
        System.out.print(middlename);
    }
}