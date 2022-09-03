public class BooleanInJava {
    public static void main (String[] args) {
        int a = 0;
        int f = 1;
        boolean b = true;
        boolean c = false;
        boolean d = (a == 0);
        boolean e = (f == 0);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        if(true) { //prints out as the the condition is set to always true condition
            System.out.println("hi, we are in the if statement");
        }
        if(d==true) {
            System.out.println("hi, we are in the if statement"); //will print out the statement
        }
        if(d==false) {
            System.out.println("hi, we are in the if statement"); //won't print out the statement
        }
        if(e==true) {
            System.out.println("hi, we are in the if statement"); //won't print out the statement
        }
        if(e==false) {
            System.out.println("hi, we are in the if statement"); //will print out the statement
        }
        if(false) { //means no sense, simply dead code, which means never going to be reached
            System.out.println("hi, we are in the if statement");
        }

        //below we passed first and the third doors
        //however we didn't pass the second one
        //as the it was false, whereas any other door was true

        boolean passedDoor = true;
        boolean missedDoor = false;
        if (passedDoor) {
            System.out.println("We passed the first door");
        }
        if (missedDoor) {
            System.out.println("We passed the second door");
        }
        if (passedDoor) {
            System.out.println("We passed the third door");
        }
    }
}