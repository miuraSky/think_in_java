
public class URShift {
    
    public static void main(String[] args) {
        int i = 1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));

        long l = -1;
        System.out.println(Long.toBinaryString(l));

        l >>>= 10;
        System.out.println(Long.toBinaryString(l));

        short s = -1;
        System.out.println(Integer.toBinaryString(s));

        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));

        byte b = -1;
        System.out.println(Integer.toBinaryString(b));

        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));

        b >>=10;
        System.out.println(Integer.toBinaryString(b));

        int x = 0xF0FF;
        System.out.println(Integer.toBinaryString(x));

        int xb = x >> 3; 
        int xc = x >>> 3;

        System.out.println(Integer.toBinaryString(xb));
        System.out.println(Integer.toBinaryString(xc));
    }
}
