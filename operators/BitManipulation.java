import java.util.Random;

public class BitManipulation {
    
    public static void main(String[] args) {
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);

        int maxpos = 2147483647;
        printBinaryInt("maxpos", maxpos);

        int maxneg = -2147483648;
        printBinaryInt("maxneg", maxneg);

        Random rand = new Random(47); 
        int i = rand.nextInt();
        int j = rand.nextInt();
        
        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);

        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);

        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);

        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt("i >>> 5", i >>> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", +1L);

        long ll = 9223372036854775807L;
        printBinaryLong("maxpos", ll);

        long lln = -9223372036854775807L;
        printBinaryLong("maxneg", lln);

        long l = rand.nextLong();
        long m = rand.nextLong();
        
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m", l | m);
        printBinaryLong("l ^ m", l ^ m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("(~l) >> 5", (~l) >> 5);
        printBinaryLong("l >>> 5", l >>> 5);
        printBinaryLong("(~l) >>> 5", (~l) >>> 5);

    }

    private static void printBinaryInt(String s, int i) {
        System.out.println(s + ": " + Integer.toBinaryString(i));
    }

    private static void printBinaryLong(String s, long l) {
        System.out.println(s + ": " + Long.toBinaryString(l));
    } 
}

