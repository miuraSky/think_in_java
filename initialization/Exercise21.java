
public class Exercise21 {
    
    public static void main(String[] args) {
        for(ExEnum ee : ExEnum.values()) {
            System.out.println(ee + ": " + ee.ordinal()); 
        }
    }

}

enum ExEnum {
    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN
}

