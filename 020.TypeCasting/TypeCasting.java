public class TypeCasting {
    public static void main(String[] args) {
        int h = (int)0.8;
        System.out.println(h);
       
        byte a;
        short b;
        char c;
        int d;
        long e;
        float f;
        double g;

        byte a1 = 8;
        int d1 = a1;
        
        double g1 = 0.8;
        int d2 = (int) g1;

        int d3 = 8;
        double g2 = d3;
    }
}