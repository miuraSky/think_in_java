
public class Exercise6 {

    static int test(int testVal, int begin, int end) {
        if (end < begin) {
            return -1;
        }

        if (testVal < begin) {
            return -1;
        }

        if (testVal > end) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        int testVal = 5, begin = 6, end = 10;

        System.out.println(test(testVal, begin, end));

        begin = 3;
        System.out.println(test(testVal, begin, end));

        end = 4;
        System.out.println(test(testVal, begin, end));
    }

}
