public class Logic {
    public static void main(String[] args) {
        // || && ! (logical operators)
        /**
         * || OR
         * && AND
         * ! NOT
         */
        boolean a = true;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);

        boolean c = true || true;
        boolean d = true || false;
        boolean e = false || false;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        boolean f = true && true;
        boolean g = true && false;
        boolean h = false && false;
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        boolean i = !true;
        boolean j = !false;
        System.out.println(i);
        System.out.println(j);

        double k = 8;
        double l = 9;
        boolean m = !(((l > k) && true) || false);
        System.out.println(m);

        double n = 3;
        double o = 5;
        boolean isSunny = true;
        boolean amHappy = false;
        if (!((n > o && isSunny) || amHappy)) {
            System.out.println("It is going to be a good day");
        }
    }
}