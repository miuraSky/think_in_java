
public class Exercise23 {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(InitOnlyOnce.INIT_VALUE);
        }

        System.out.println("-----------------------------");

        for (int i = 0; i < 10; ++i) {
            new InitOnlyOnce().printInitValue();
        }


    }
}

class InitOnlyOnce {
    
    private static int START = 144;

    public static int INIT_VALUE = START++;

    void printInitValue() {
        System.out.println(INIT_VALUE);
    }
}

