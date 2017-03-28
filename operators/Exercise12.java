
public class Exercise12 {
    
    public static void main(String[] args) {
        int x = -1;
        System.out.println("x: " + Integer.toBinaryString(x));

        int xl = x << 4;
        System.out.println("xl = x << 4: " + Integer.toBinaryString(xl));

        int xr = xl >> 4;
        System.out.println("xr  = xl >> 4: " + Integer.toBinaryString(xr));

        int xrr = xl >>> 4;
        System.out.println("xrr = xl >>> 4: " + Integer.toBinaryString(xrr));
    }
}
