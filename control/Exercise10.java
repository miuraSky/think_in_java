
public class Exercise10 {

    public static void main(String[] args) {
        for (int i = 1000; i < 10000; ++i) {
            if (isVampire(i)) {
                System.out.println();
            }
        }
    }

    static boolean isVampire(int num) {
        char[] sn = splitNum(num);
        char[] x = new char[2];
        char[] y = new char[2];
        for (int i = 0; i < 4; ++i) {
            x[0] = sn[i];
            for (int j = 0; j < 4; j ++) {
                if (j != i) {
                    x[1] = sn[j];

                    int z = 0;
                    for (int k = 0; k < 4; k++) {
                        if (k != i && k != j) {
                            y[z++] = sn[k];
                        }
                    }

                    int ix = Integer.parseInt(new String(x));
                    int iy = Integer.parseInt(new String(y));

                    if ((ix * iy) == num) {
                        System.out.print(num + " = " + ix + " * " + iy); 
                        return true;
                    }

                    iy = Integer.parseInt(new String(reverse(y)));

                    if ((ix * iy) == num) {
                        System.out.print(num + " = " + ix + " * " + iy); 
                        return true;
                    }

                }
            }
        }

        return false;
    }

    static char[] reverse(char[] y) {
        char[] r = new char[2];
        r[0] = y[1];
        r[1] = y[0];

        return r;
    }

    static char[] splitNum(int num) {
        char[] sn = new char[4];

        sn[3] = num2Char(num % 10);
        sn[2] = num2Char((num / 10) % 10);
        sn[1] = num2Char((num / 100) % 10);
        sn[0] = num2Char(num / 1000);

        return sn;
    }

    static char num2Char(int num) {
        return (char)('0' + num);
    }
}

