public class Main {
    public static void main(String[] args) { //main method
        /**
         * public - it can be seen
         * static - you do not have to make an object so-called main method
         * void - it does not return anything
         * main - is the name we give it so that java knows that is a main method
         * String[] - array argument
         * args - parameter
         */
        sayHi();
        sayHello();
        saySomething("hey"); //Cannot make a static reference to the non-static method sayHi() from the type Main (when the regular method is not static)
        String[] t = {"hello", "sup"};
        saySomethingElse(t);
        System.out.println(args); //by default it shows gibberish, but in 'run configuration' we can set initial arguments and print it like 'args[]'
        if (args[0].equals("hi")) {
            System.out.println("args hi");
        } else if (args[1].equals("hello")) {
            System.out.println("args hello");
        }
    }
    // void sayHi() { //regular method which doesn't require return type, second thing we make static to make reference
    //     System.out.println("hi");
    // }
    static void sayHi() { //regular method which doesn't require return type, second thing we make static to make reference
        System.out.println("hi");
    }
    public static void sayHello() { //regular method which doesn't require return type, second thing we make static to make reference
        System.out.println("hello");
    }
    public static void saySomething(String s) { //method with a parameter
        System.out.println(s);
    }
    public static void saySomethingElse(String[] t) { //method with array argument
        System.out.println(t[1]);
    }
    /**
     * run from command line windows
     * cd desktop
     * javac HelloWorld.java
     * java HelloWorld
     */
}