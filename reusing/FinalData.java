import java.util.Random;

class Value {
    int i; // Package access

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
   
    private static Random rand = new Random(47);

    private String id;

    public FinalData(String id) {
        this.id = id;
    }
    
    // Can be compile-time constants
    private final int valueOne = 9; 

    private static final int VALUE_TWO = 99;

    // Typical public constant
    public static final int VALUE_THREE = 39;

    // Cannot be compile-time constants
    private final int i4 = rand.nextInt(20);

    static final int INT_5 = rand.nextInt(20);
    
    private Value v1 = new Value(11);

    private final Value v2 = new Value(22);

    private static final Value VAL_3 = new Value(33);

    //Arrays
    private final int[] a = { 1, 2, 3, 4, 5, 6 };

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData orc = new FinalData("orc");
        orc.v2.i++;
        orc.v1 = new Value(9);
        
        for (int i = 0; i < orc.a.length; i++) {
            orc.a[i] ++;

        }
        System.out.println(orc);

        System.out.println("Creating new FinalData");

        FinalData human = new FinalData("human");
        System.out.println(orc);
        System.out.println(human);
    }
}
