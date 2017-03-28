import java.util.Random;
import java.util.Arrays;

public class ArrayNew {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[rand.nextInt(47)];

        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}

