public class DoubleLongFloat {
    public static void main (String[] args) {
        int a = 888888888;
        long b = 99999999999999L;
        float c = 8.1f;
        float d = 8.8F;
        double e = 999999999999999999999.0;
        double f = 888888888;
        byte g = 8;
        short h = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        /*
        Type        Size          Range
        byte        8 bits       -128 .. +127
        short       16 bits      -32,768 .. +32,767
        int         32 bits      -2,147,483,648 .. +2,147,483,647
        long        64 bits      -9,223,372,036,854,775,808 .. +9,223,372,036,854,775,807
        float       32 bits      +3.40282347x10^(38),+1.40239846x10^(-45)
        double      64 bits      +1.7976931348623157x10(308),+4.9406564584124654x1^0(-324)
        */
// Type	    Description	             Default 	Size	    Example Literals
// boolean	true or false	         false	    1 bit	    true, false
// byte	    twos complement integer	 0	        8 bits     	(none)
// char	    Unicode character	     \u0000 	16 bits	    'a', '\u0041', '\101', '\\', '\'', '\n', 'ß'
// short	twos complement integer	 0	        16 bits	    (none)
// int	    twos complement integer	 0	        32 bits 	-2, -1, 0, 1, 2
// long	    twos complement integer  0	        64 bits	    -2L, -1L, 0L, 1L, 2L
// float	IEEE 754 floating point	 0.0	    32 bits	     1.23e100f, -1.23e-100f, .3f, 3.14F
// double	IEEE 754 floating point	 0.0	    64 bits	     1.23456e300d, -1.23456e-300d, 1e1d
        
        // The eight primitive data types in Java are:
        // boolean, the type whose values are either true or false
        // char, the character type whose values are 16-bit Unicode characters
        // the arithmetic types:
        // the integral types:
        // byte
        // short
        // int
        // long
        // the floating-point types:
        // float
        // double
        // Values of class type are references. Strings are references to an instance of class String.
    }
}