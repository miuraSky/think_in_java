
public class ForEachInt {

    public static void main(String[] args) {
        for (int i : range(10)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : range(5, 10)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : range(5, 20, 3)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] range(int range) {
        int[] result = new int[range];

        for (int i = 0, j = 0; i < range; ++i, ++j) {
            result[j] = i;
        }

        return result;
    }

    public static int[] range(int start, int end) {
        int[] result = new int[end - start > 0 ? end - start : 0];

        for (int i = start, j = 0; i < end; ++i, ++j) {
           result[j] = i;
        }

        return result;
    }

    public static int[] range(int start, int end, int step) {
        step = step < 1 ? 1 : step;
        int[] result = new int[end - start > 0 ? (end - start) / step : 0];

        for (int i = start, j = 0; i < end; i += step, ++j) {
            result[j] = i;
        }

        return result;
    }

}
