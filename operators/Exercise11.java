
public class Exercise11 {
    
    public static void main(String[] args) {
       int x = 0x1000; 

       System.out.println(Integer.toBinaryString(x));
       System.out.println(Integer.toBinaryString(x >> 4));
       System.out.println(Integer.toBinaryString(x >>> 4));
    }
}
