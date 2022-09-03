public class StringToint {
    public static void main(String[] args) {
        //String into int
        String s1 = "102";
        System.out.println(s1+8); //still string
        System.out.println(Integer.parseInt(s1) + 8); //now integer
        //another way
        String s2 = "102";
        int n = Integer.parseInt(s2);
        System.out.println(n + 6);
        //another method
        int m = Integer.parseInt("8");
        System.out.println("8" + 2);
        System.out.println(m + 2);
        //int into String
        int k= 8;
        System.out.println(k + 1);
        System.out.println(Integer.toString(k) + 1);
        String l = "age: 88";
        l = l.replaceAll("\\D+", "");
        System.out.println(l);
        int o = Integer.parseInt(l);
        System.out.println(o-8);
    }
}