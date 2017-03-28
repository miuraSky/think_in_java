
public class Exercise9 {
    
    public static void main(String[] args) {
        try {
            int fEnd = Integer.parseInt(args[0]);
            System.out.println("fEnd = " + fEnd);

            fibonacci(fEnd);
        } catch(Exception e) {
            System.out.println("Illigal param");
            System.exit(-1);
        }
    }

    static void fibonacci(int fEnd) {
        int first = 1;
        int second = 1;

        System.out.print(first + ", " + second + ", ");

        while(true) {
            int third = first + second;
            System.out.print(third);
            first = second;
            second = third;

            if (third > fEnd) {
                break;
            }
            System.out.print(", ");
        }

        System.out.println();
    }
}
