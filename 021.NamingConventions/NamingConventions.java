import java.util.Scanner;
public class NamingConventions {
    static final int MAX_PEOPLE = 80; //final means that the variable is not going to be change, we add static to assure that the variable is never going to change
    public static void main(String[] args) {
        int ageOfStudent = 5;
        Scanner scan = new Scanner(System.in);
        final int MAX_AGE = 100; //final means that the variable is not going to be change
        //name cannot have spaces
        //cannot start with symbols
        //cannot start with numbers
        //cannot can start with a character
        //class should start with an uppercase and no abbreviations (intefaces follow the same rule)
        //method name should start with a lowercase, verb (because methods are actions)
        System.out.println(addTwoNumbers(8, 4));
    }
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }
}