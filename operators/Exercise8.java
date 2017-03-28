
public class Exercise8 {
    
    public static void main(String[] args) {
        
        int i1 = 0x2F; // Hexadecimal (lowercase)
        System.out.println("i1: " + Integer.toBinaryString(i1));

        int i2 = 0x2F; // Hexadecimal (uppercase)
        System.out.println("i2: " + Integer.toBinaryString(i2));

        int i3 = 0177; // octal (leading zero)
        System.out.println("i3: " + Integer.toBinaryString(i3));

        char c = 0xFFFF; // max char hex value
        System.out.println("c: " + Integer.toBinaryString(c));
        
        byte b = 0x7F; // max byte hex value
        System.out.println("b: " + Integer.toBinaryString(b));

        short s = 0x7FFF; // max short hex value
        System.out.println("s: " + Integer.toBinaryString(s));
        
        long n1 = 200L; // long suffix
        long n2 = 200l; // long suffix (but can be confusing)
        long n3 = 200;
        System.out.println("n1: " + Long.toBinaryString(n1));

        float f1 = 1;
        float f2 = 1F; // float suffix
        float f3 = 1f; // float suffix
        System.out.println("f1: " + Float.toHexString(f1));
        System.out.println("f2: " + Float.toHexString(f2));

        double d1 = 1d; // double suffix
        double d2 = 1D; // double suffix
        System.out.println("d1: " + Double.toHexString(d1));

    }

}
