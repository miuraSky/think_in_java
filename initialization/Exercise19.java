
public class Exercise19 {
    
    static void alima(String... strs) {
        for (String s : strs) {
            System.out.print(s + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        alima("Live", "or", "die", "in", "22", "minutes");

        String[] alima = new String[] { "alima", "amila"};
        alima(alima);
    }
}
