import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade:");
        int n = scan.nextInt();
        if (n<=100 && n>=90) {
            System.out.print("Your grade is ");
            System.out.println("A");
        } else if (n<90 && n>=80) {
            System.out.print("Your grade is ");
            System.out.println("B");
        } else if (n<80 && n>=70) {
            System.out.print("Your grade is ");
            System.out.println("C");
        } else if (n<70 && n>=60) {
            System.out.print("Your grade is ");
            System.out.println("D");
        } else if (n<60 && n>=0) {
            System.out.print("Your grade is ");
            System.out.println("F");
        } else {
            System.out.println("Your entered grade is not in the range.");
        }
    }
}