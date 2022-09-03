import java.util.Scanner;
public class Exponent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        double a = scan.nextDouble();
        System.out.println("Enter power of the number:");
        double b = scan.nextDouble();
        double c = Math.pow(a, b);
        System.out.println("The result is:");
        System.out.println(a+"^"+b+"="+c);
    }
}
