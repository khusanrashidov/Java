import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scan.nextInt();
        scan.close();
        if (num == 1) {
            System.out.println("1 is a not a prime number");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is prime number");
            } else {
                System.out.println(num + " is composite number");
            }
        }
    }
}