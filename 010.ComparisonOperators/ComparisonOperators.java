public class ComparisonOperators {
    public static void main(String[] args) {
        double a, b;
        a = 5;
        b = 8;
        boolean c = (a != b); //comparison operator != not equal to
        System.out.println(c);
        /*
        * < less than
        * <= less then or equal to
        * == equal to
        * >= greater than or equal to
        * > greater than
        */
        double d = 8.1;
        if (d == 8.1)
        {
            System.out.println("they are equal");
        }
        if (d > 8.8)
        {
            System.out.println("greater than 8.8");
        }
        if (d == 8.8 || d == 8.1) //OR ||
        {
            System.out.println("d is 8.1 or 8.8");
        }
        if (d == 8.8 || d == 8.1 || d == 8) //OR ||
        {
            System.out.println("d is 8.1 or 8.8 or 8");
        }
        if(d >= 0 && d <= 10 && d != 8)
        {
            System.out.println("d is in the range");; //AND &&
        }
    }
}