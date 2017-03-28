import java.util.Scanner;
import java.util.Random;

public class Exercise16 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(new ProduceMD5Chars());

        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}

class ProduceMD5Chars implements Readable {

    private static final char[] ups = "0123456789abcde".toCharArray();

    private Random rand = new Random();

    private int count = 32;
        
    @Override
    public int read(java.nio.CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }

        cb.append(ups[rand.nextInt(ups.length)]);

        
        return 1;
    }
}
