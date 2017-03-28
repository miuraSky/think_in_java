import java.util.Random;

public class Exercise3 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int firstRand = rand.nextInt(100);
        int secondRand = rand.nextInt(100);

        System.out.println("secondRand = " + secondRand);

        if (firstRand > secondRand) {
            System.out.println(firstRand + " > " + secondRand);
        }

        for (;;) {
            int tmp = rand.nextInt(100);
            if (tmp > secondRand) {
                System.out.println(tmp  + " > " + secondRand);
            } else {
                System.out.println(tmp + " < " + secondRand);
            }
        }
    }
}
