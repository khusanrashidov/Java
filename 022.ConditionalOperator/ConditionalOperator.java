public class ConditionalOperator {
    public static void main(String[] args) {
        int a = (12 > 8) ? 12 : 8; //(condition) ? true : false
        System.out.println(a);
        //below code is the same as the above conditional operator
        /** 
         * if (12 > 8) {
         *     a = 17;
         * } else {
         *     a = 8;
         * }
         * System.out.println(a);
        */
        String s = "hi";
        double result1 = s.equals("hi") ? 8 : 8.1;
        System.out.println(result1);
        double result2 = s.equals("howdy") ? 8 : 8.1;
        System.out.println(result2);
        String result3 = s.equals("hi") ? "hey" : "hello";
        System.out.println(result3);

    }
}